package com.hspedu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端等待连接");
        //如果没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户端连接，则会返回socket对象，程序继续
        Socket socket = serverSocket.accept();

        System.out.println("socket =" + socket.getClass());
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = inputStream.read(buf);
        while(readLen!=-1){
            System.out.println(new String(buf,0,readLen));
            readLen = inputStream.read(buf);
        }

        inputStream.close();
        socket.close();
        serverSocket.close();




    }
}
