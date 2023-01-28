package com.example.client;

import com.example.files.AddInputRespose;
import com.example.files.FileUploadServiceGrpc;
import com.example.files.SortInputResponse;
import com.google.protobuf.ByteString;
import com.sun.source.tree.UsesTree;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.awaitility.Awaitility;
import org.awaitility.Duration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class AsynchronousFileUploadClient implements FileUploadClient{

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();
    @Override
    public void uploadFile(String fileName, String directory, String destDirectory, Consumer<com.example.files.UploadFileResponse> consumer){


        FileUploadServiceGrpc.FileUploadServiceStub stub
                = FileUploadServiceGrpc.newStub(channel);

        FileServerCallBack<com.example.files.UploadFileResponse> streamObserver = new FileServerCallBack<>(consumer);

        stub.uploadFile(com.example.files.UploadFileRequest.newBuilder()
                .setDirectory(destDirectory)
                .setFileName(fileName).setPayload(readBytes(fileName, directory))
                .build(), streamObserver );

        waitUntilRequestCompleted(streamObserver);

    }

    @Override
    public void downloadFile(String fileName, String directory, Consumer<com.example.files.DownloadFileResponse> consumer) throws ExecutionException, InterruptedException {
        FileUploadServiceGrpc.FileUploadServiceStub stub
                = FileUploadServiceGrpc.newStub(channel);

        FileServerCallBack<com.example.files.DownloadFileResponse> streamObserver = new FileServerCallBack<>(this::writeBytes);
        stub.downloadFile(com.example.files.DownloadFileRequest.newBuilder().setFileName(fileName).setDirectory(directory).build(), streamObserver);

        waitUntilRequestCompleted(streamObserver);
    }

    @Override
    public void renameFile(String fromFile, String directory, String toFile, Consumer<com.example.files.RenameFileResponse> consumer){
        FileUploadServiceGrpc.FileUploadServiceStub stub
                = FileUploadServiceGrpc.newStub(channel);

        FileServerCallBack<com.example.files.RenameFileResponse> streamObserver = new FileServerCallBack<>(consumer);

        stub.renameFile(com.example.files.RenameFileRequest.newBuilder()
                .setFromFileName(fromFile).setToFileName(toFile).setDirectory(directory).build(), streamObserver);

        waitUntilRequestCompleted(streamObserver);
    }

    @Override
    public void deleteFile(String fileName, String directory, Consumer<com.example.files.DeleteFileResponse> consumer){
        FileUploadServiceGrpc.FileUploadServiceStub stub
                = FileUploadServiceGrpc.newStub(channel);

        FileServerCallBack<com.example.files.DeleteFileResponse> streamObserver = new FileServerCallBack<>(consumer);
        stub.deleteFile(com.example.files.DeleteFileRequest.newBuilder()
                .setDirectory(directory).setFileName(fileName).build(), streamObserver);
        waitUntilRequestCompleted(streamObserver);
    }

    @Override
    public int add(int first, int second, Consumer<AddInputRespose> consumer) {
        FileUploadServiceGrpc.FileUploadServiceStub stub = FileUploadServiceGrpc.newStub(channel);
        AtomicInteger result = new AtomicInteger();
        FileServerCallBack<AddInputRespose> streamObserver = new FileServerCallBack<>(response -> {
            System.out.println(response.getResult());
            result.set((int)response.getResult());
        });
        stub.add(com.example.files.AddInputRequest.newBuilder().setI(first).setJ(second).build(), streamObserver );
        waitUntilRequestCompleted(streamObserver);
        return result.get();
    }

    @Override
    public int[] sort(int[] input, Consumer<SortInputResponse> consumer) {

        com.example.files.SortInputRequest.Builder sortInputRequestBuilder = com.example.files.SortInputRequest.newBuilder();
        for (int each: input){
            sortInputRequestBuilder.addInput(each);
        }

        AtomicIntegerArray resultArray = null;
        AtomicReference<List<Integer>> sortedvalues = new AtomicReference<>(null);
        com.example.files.SortInputRequest request = sortInputRequestBuilder.build();
        FileUploadServiceGrpc.FileUploadServiceStub stub = FileUploadServiceGrpc.newStub(channel);
        FileServerCallBack<SortInputResponse> streamObserver = new FileServerCallBack<>(response -> {
            sortedvalues.set(response.getOutputList());
        });

        stub.sort(request, streamObserver);
        waitUntilRequestCompleted(streamObserver);
        int[] result = new int[sortedvalues.get().size()];
        for(int i = 0; i < sortedvalues.get().size(); i++)
            result[i] = sortedvalues.get().get(i);

        return result;
    }

    private void waitUntilRequestCompleted(FileServerCallBack fileServerCallBack){
        Awaitility.await().atMost(Duration.FIVE_SECONDS).untilTrue(fileServerCallBack.isRequestCompleted);

    }

    private ByteString readBytes(String fileName, String directory){
        try{
            File file = new File(directory + "/" + fileName);
            if(file.exists()){
                byte[] content = new byte[(int)file.length()];
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
                input.read(content, 0, content.length);
                input.close();
                return ByteString.copyFrom(content);
            }
            throw new FileNotFoundException(fileName);
        }catch (FileNotFoundException ex){
            System.out.println("File not found "+ fileName);
            throw new RuntimeException(ex);
        }
        catch (Exception ex){
            System.out.println("Exception in reading "+ fileName);
            throw new RuntimeException(ex);
        }
    }

    private boolean writeBytes(com.example.files.DownloadFileResponse downloadFileResponse){
        InputStream is = new ByteArrayInputStream(downloadFileResponse.getContent().toByteArray());
        File file = new File("/Users/divya/Desktop/" + downloadFileResponse.getFileName());
        try(FileOutputStream fos = new FileOutputStream(file, false)){
            int read;
            int defaultBufferSiize = 8192;
            byte[] bytes = new byte[defaultBufferSiize];
            while ((read = is.read(bytes)) != -1){
                fos.write(bytes, 0, read);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    private static class FileServerCallBack<T> implements StreamObserver<T> {

        private final Consumer<T> consumer;
        private volatile AtomicBoolean isRequestCompleted = new AtomicBoolean(false);

        private FileServerCallBack(Consumer<T> consumer) {
            this.consumer = consumer;
        }

        @Override
        public void onNext(T value) {
            if(null != consumer)
                consumer.accept(value);
            System.out.println("Received product, {}"+value.toString());
            isRequestCompleted.set(true);
        }

        @Override
        public void onError(Throwable cause) {

            System.out.println(cause.getCause());
            isRequestCompleted.set(true);
        }

        @Override
        public void onCompleted() {
            System.out.println("completed");
            isRequestCompleted.set(true);
        }

        public boolean isComplete(){
            return isRequestCompleted.get();
        }
    }
}
