package com.hspedu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.receive data on port 9998
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        //2.将需要发送的数据pack into a DatagramPacket object
        byte[] data = "hello server long time no see".getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);
        datagramSocket.send(datagramPacket);

        byte[] buf = new byte[1024];
        DatagramPacket datagramPacketReceive = new DatagramPacket(buf, buf.length);
        //3. call receive method to receive data
        datagramSocket.receive(datagramPacketReceive);

        int length  = datagramPacketReceive.getLength();
        byte[] receiveData = datagramPacketReceive.getData();


        String s = new String(receiveData, 0, length);
        System.out.println(s);





        datagramSocket.close();
        System.out.println("B端退出");




    }
}
