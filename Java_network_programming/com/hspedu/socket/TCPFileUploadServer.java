package com.hspedu.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server waiting for connection");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] picture = inputStream.readAllBytes();
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/zhanglinxiao/brick/copy.png");
        fileOutputStream.write(picture);
        fileOutputStream.close();

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("accept picture".getBytes(StandardCharsets.UTF_8));
        accept.shutdownOutput();

        outputStream.close();
        accept.close();
        inputStream.close();
        serverSocket.close();



    }
}
