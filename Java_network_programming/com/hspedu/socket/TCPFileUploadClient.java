package com.hspedu.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;

public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/zhanglinxiao/download.png");
        byte[] picture = fileInputStream.readAllBytes();
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(picture);
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        System.out.println(new String(bytes));

        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
