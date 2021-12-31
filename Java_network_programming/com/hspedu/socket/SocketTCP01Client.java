package com.hspedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP01Client {
    public static void main(String[] args)  throws IOException {
        //如果连接成功，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回="+socket.getClass());
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = inputStream.read(buf);
        while(readLen!=-1){
            System.out.println(new String(buf,0,readLen));
            readLen = inputStream.read(buf);
        }

        outputStream.close();
        socket.close();
        System.out.println("客户端退出");


    }
}
