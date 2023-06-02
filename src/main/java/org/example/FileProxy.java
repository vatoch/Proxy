package org.example;

import java.io.IOException;

public class FileProxy implements FileInterface {

    FileClass fileClass;

    String source;

    public FileProxy(String source) {
        this.source = source;
    }


    @Override
    public void downloadFile(String path) throws IOException {
        if(fileClass==null) {
            fileClass =  new FileClass(source);

        }
        fileClass.downloadFile(path);
    }
}
