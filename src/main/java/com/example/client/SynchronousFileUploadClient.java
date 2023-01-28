package com.example.client;

import com.example.files.AddInputRespose;
import com.example.files.FileUploadServiceGrpc;
import com.example.files.SortInputResponse;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.*;
import java.util.List;
import java.util.function.Consumer;

public class SynchronousFileUploadClient implements FileUploadClient {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();

    @Override
    public void uploadFile(String fileName, String directory, String destDirectory, Consumer<com.example.files.UploadFileResponse> consumer) {


        FileUploadServiceGrpc.FileUploadServiceBlockingStub stub
                = FileUploadServiceGrpc.newBlockingStub(channel);

        com.example.files.UploadFileResponse uploadFileResponse = stub.uploadFile(com.example.files.UploadFileRequest.newBuilder()
                .setDirectory(destDirectory)
                .setFileName(fileName).setPayload(readBytes(fileName, directory))
                .build());

        if (uploadFileResponse != null && null != consumer) {
            consumer.accept(uploadFileResponse);
        }

        channel.shutdown();
    }

    @Override
    public void downloadFile(String fileName, String directory, Consumer<com.example.files.DownloadFileResponse> consumer) {


        FileUploadServiceGrpc.FileUploadServiceBlockingStub stub
                = FileUploadServiceGrpc.newBlockingStub(channel);

        com.example.files.DownloadFileResponse downloadFileResponse = stub.downloadFile(com.example.files.DownloadFileRequest.newBuilder().setFileName(fileName).setDirectory(directory).build());
        if (null != downloadFileResponse) {
            writeBytes(downloadFileResponse);
            if (null != consumer) {
                consumer.accept(downloadFileResponse);
            }
        }

        channel.shutdown();
    }

    @Override
    public void renameFile(String fromFile, String directory, String toFile, Consumer<com.example.files.RenameFileResponse> consumer) {


        FileUploadServiceGrpc.FileUploadServiceBlockingStub stub
                = FileUploadServiceGrpc.newBlockingStub(channel);

        com.example.files.RenameFileResponse renameFileResponse = stub.renameFile(com.example.files.RenameFileRequest.newBuilder()
                .setFromFileName(fromFile).setToFileName(toFile).setDirectory(directory).build());

        if (null != renameFileResponse && null != consumer)
            consumer.accept(renameFileResponse);
        channel.shutdown();
    }

    @Override
    public void deleteFile(String fileName, String directory, Consumer<com.example.files.DeleteFileResponse> consumer) {


        FileUploadServiceGrpc.FileUploadServiceBlockingStub stub
                = FileUploadServiceGrpc.newBlockingStub(channel);

        com.example.files.DeleteFileResponse deleteFileResponse = stub.deleteFile(com.example.files.DeleteFileRequest.newBuilder()
                .setDirectory(directory).setFileName(fileName).build());

        if (null != deleteFileResponse && deleteFileResponse.getDeleteResult() && null != consumer)
            consumer.accept(deleteFileResponse);
        channel.shutdown();
    }

    @Override
    public int add(int first, int second, Consumer<AddInputRespose> consumer) {

        FileUploadServiceGrpc.FileUploadServiceBlockingStub stub = FileUploadServiceGrpc.newBlockingStub(channel);
        AddInputRespose response = stub.add(com.example.files.AddInputRequest.newBuilder().setI(first).setJ(second).build());
        System.out.println(response.getResult());
        return (int) response.getResult();
    }

    @Override
    public int[] sort(int[] input, Consumer<SortInputResponse> consumer) {

        com.example.files.SortInputRequest.Builder sortInputRequestBuilder = com.example.files.SortInputRequest.newBuilder();
        for (int each : input) {
            sortInputRequestBuilder.addInput(each);
        }

        com.example.files.SortInputRequest request = sortInputRequestBuilder.build();
        FileUploadServiceGrpc.FileUploadServiceBlockingStub stub = FileUploadServiceGrpc.newBlockingStub(channel);
        SortInputResponse sortInputResponse = stub.sort(request);
        List<Integer> sortedInteger = sortInputResponse.getOutputList();
        int[] result = new int[sortedInteger.size()];
        int counter = 0;
        for (int each : sortedInteger)
            result[counter++] = each;

        return result;
    }


    private ByteString readBytes(String fileName, String directory) {
        try {
            File file = new File(directory + "/" + fileName);
            if (file.exists()) {
                byte[] content = new byte[(int) file.length()];
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
                input.read(content, 0, content.length);
                input.close();
                return ByteString.copyFrom(content);
            }
            throw new FileNotFoundException(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found " + fileName);
            throw new RuntimeException(ex);
        } catch (Exception ex) {
            System.out.println("Exception in reading " + fileName);
            throw new RuntimeException(ex);
        }
    }

    private boolean writeBytes(com.example.files.DownloadFileResponse downloadFileResponse) {
        InputStream is = new ByteArrayInputStream(downloadFileResponse.getContent().toByteArray());
        File file = new File("/Users/divya/Desktop/" + downloadFileResponse.getFileName());
        try (FileOutputStream fos = new FileOutputStream(file, false)) {
            int read;
            int defaultBufferSiize = 8192;
            byte[] bytes = new byte[defaultBufferSiize];
            while ((read = is.read(bytes)) != -1) {
                fos.write(bytes, 0, read);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
