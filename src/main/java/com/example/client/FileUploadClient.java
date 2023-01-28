package com.example.client;

import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

public interface FileUploadClient {

    void uploadFile(String fileName, String directory, String destDirectory, Consumer<com.example.files.UploadFileResponse> consumer);

    void downloadFile(String fileName, String directory, Consumer<com.example.files.DownloadFileResponse> consumer) throws ExecutionException, InterruptedException;

    void renameFile(String fromFile, String directory, String toFile, Consumer<com.example.files.RenameFileResponse> consumer);

    void deleteFile(String fileName, String directory, Consumer<com.example.files.DeleteFileResponse> consumer);

    int add(int first, int second, Consumer<com.example.files.AddInputRespose> consumer);

    int[] sort(int[] input, Consumer<com.example.files.SortInputResponse> consumer);

    FileUploadClient syncClient = new SynchronousFileUploadClient();
    FileUploadClient asyncClient = new AsynchronousFileUploadClient();
}
