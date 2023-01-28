
package com.example.client;

import java.util.concurrent.ExecutionException;

public class FileUploadClientTester {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FileUploadClient fileUploadClient;
        if(Integer.parseInt(args[0]) == 0)
            fileUploadClient = FileUploadClient.syncClient;
        else
            fileUploadClient = FileUploadClient.asyncClient;

        Operations operation = Operations.valueOf(args[1]);

        switch (operation){
            case UPLOAD: {
                String fileDirectory = args[2];
                String fileName = args[3];
                fileUploadClient.uploadFile(fileName, fileDirectory, args[4], uploadFileResponse -> System.out.println(String.format("%s uploaded successfully ", uploadFileResponse.getFileName())));
                break;
            }
            case DELETE: {
                String fileDirectory = args[2];
                String fileName = args[3];
                fileUploadClient.deleteFile(fileName, fileDirectory, deleteFileResponse -> System.out.println(String.format("%s deleted successfully", deleteFileResponse.getFileName())));
                break;
            }
            case RENAME: {
                String fileDirectory = args[2];
                String fileName = args[3];
                fileUploadClient.renameFile(fileName, fileDirectory, args[4], renameFileResponse -> System.out.println(String.format("successfully renamed file from %s to %s", renameFileResponse.getFromFileName(), renameFileResponse.getToFileName())));
                break;
            }
            case DOWNLOAD: {
                String fileDirectory = args[2];
                String fileName = args[3];
                fileUploadClient.downloadFile(fileName, fileDirectory, null);
                Thread.sleep(5000L);
                break;
            }
            case ADD: {
                fileUploadClient.add(10, 15, addInputRespose -> System.out.println(String.format("Result of %d + %d = %d", 10, 15, addInputRespose.getResult())));
                break;
            }
            case SORT:{
                int[] sorted = fileUploadClient.sort(new int[]{5 , 1, 7, -2, 10, 200, -85}, null);
                for(int each: sorted)System.out.println(each + "   ");
                break;
            }
            default :
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}

enum Operations{
    UPLOAD, DOWNLOAD, RENAME, DELETE, ADD, SORT;
}

