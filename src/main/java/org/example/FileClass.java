package org.example;

import java.io.*;

public class FileClass implements FileInterface{
    byte [] file;

    public FileClass(String source) {
        try (FileInputStream input = new FileInputStream(source)){
            file = input.readAllBytes();

        } catch(IOException v) {
            v.printStackTrace();
        }

    }

    public void downloadFile(String path) throws IOException {
        File file = new File(path);

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(this.file);
        outputStream.close();

    }
}
