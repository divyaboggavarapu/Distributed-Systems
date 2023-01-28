package com.example.client.oberver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileSynchupCache extends Thread{
    private  final FileObserver fileObserver;

    public FileSynchupCache(FileObserver fileObserver) {
        this.fileObserver = fileObserver;
    }

    @Override
    public void run() {
        saveCache(fileObserver.getCacheOfFilesSync(), fileObserver.getFile());
    }

    private void saveCache(Map<String, Long> cache, File file){

        BufferedWriter bf = null;

        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));

            // iterate map entries
            for (Map.Entry<String, Long> entry :
                    cache.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + "-------"
                        + entry.getValue());

                // new line
                bf.newLine();
            }

            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                // always close the writer
                assert bf != null;
                bf.close();
            }
            catch (Exception e) {
            }
        }
    }
}
