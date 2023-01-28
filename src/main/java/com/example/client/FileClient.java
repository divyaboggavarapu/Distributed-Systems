package com.example.client;

import com.example.client.oberver.FileObserver;
import com.example.client.oberver.FileSynchupCache;

public class FileClient {

    public static void main(String[] args) {
        FileObserver fileObserver = new FileObserver();
        Runtime.getRuntime().addShutdownHook(new FileSynchupCache(fileObserver));
        Thread thread = new Thread(fileObserver);
        thread.start();
    }
}
