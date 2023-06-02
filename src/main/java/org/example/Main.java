package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileInterface fileInterface = new FileProxy("/home/vato/Downloads/Proxy/src/main/java/org/example/book.txt");
        fileInterface.downloadFile("/home/vato/Downloads/Proxy/src/test/copy.txt");

    }
}