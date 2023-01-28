package com.example.client.oberver;

import com.example.client.FileUploadClient;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

import java.io.*;
import java.nio.file.FileSystems;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class FileObserver implements Runnable {

    private final Map<String, Long> cacheOfFilesSync;

    private final FileUploadClient fileUploadClient;

    private final String fileSeparator = FileSystems.getDefault().getSeparator();

    private final String sourceLocationDirectory = "/Users/divya/Desktop/client";

    public Map<String, Long> getCacheOfFilesSync() {
        return cacheOfFilesSync;
    }

    public File getFile(){
        return new File(sourceLocationDirectory + fileSeparator + ".sync" + fileSeparator + "synupdata");
    }

    public FileObserver(){
        File file = new File(sourceLocationDirectory + fileSeparator + ".sync" + fileSeparator + "synupdata");
        if(!file.exists()){
            file.getParentFile().mkdirs();
            cacheOfFilesSync = new HashMap<>();
        }else {
            cacheOfFilesSync = loadExistingCache(file);
        }
        this.fileUploadClient = FileUploadClient.asyncClient;
    }



    private Map<String, Long> loadExistingCache(File file){
        Map<String, Long> existingCache = new HashMap<>();
        if(!file.exists())
            return existingCache;
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                String[] entries = line.split("-------");
                existingCache.put(entries[0], Long.parseLong(entries[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return existingCache;
    }


    @Override
    public void run() {

        while (true){

            try {
                File drive = new File(sourceLocationDirectory);
                if (drive.isDirectory()) {

                    Map<String, File> files = FileUtils.listFiles(
                            drive,
                            new RegexFileFilter("^(.*?)"),
                            DirectoryFileFilter.DIRECTORY
                    ).stream().collect(Collectors.toMap(File::getAbsolutePath, e -> e));

                    Iterator<Map.Entry<String, Long>> entryIterator = cacheOfFilesSync.entrySet().iterator();

                    while(entryIterator.hasNext()){
                        Map.Entry<String, Long> fileEntry = entryIterator.next();
                        if(!files.containsKey(fileEntry.getKey())){
                            String fileName = fileEntry.getKey().substring(fileEntry.getKey().lastIndexOf(fileSeparator));
                            String directory = fileEntry.getKey().substring(0, fileEntry.getKey().lastIndexOf(fileSeparator)).replace(sourceLocationDirectory, "");
                            fileUploadClient.deleteFile(fileName, directory, deleteFileResponse -> entryIterator.remove());
                        }
                    }

                    for (File eachFile : files.values()) {

                        String fileName = eachFile.getName();
                        String destDir = eachFile.getParentFile().getAbsolutePath().replace(sourceLocationDirectory, "");
                        String directory = eachFile.getParentFile().getAbsolutePath();

                        if (cacheOfFilesSync.getOrDefault(eachFile.getAbsolutePath(), -1L) != FileUtils.lastModified(eachFile)) {
                            fileUploadClient.uploadFile(fileName, directory, destDir, uploadFileResponse -> {
                                try {
                                    cacheOfFilesSync.put(eachFile.getAbsolutePath(), FileUtils.lastModified(eachFile));
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            });
                        }
                    }

                }

                Thread.sleep(10000L);
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
