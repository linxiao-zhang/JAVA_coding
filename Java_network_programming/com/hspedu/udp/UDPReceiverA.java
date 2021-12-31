package com.hspedu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个DatagramSocket对象，准备在9999端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2. 构建一个DatagramPacket对象，准备接收数据
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        //3. call receive method to receive data
        datagramSocket.receive(datagramPacket);
        //4.unpack
        int length  = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();


        String s = new String(data, 0, length);
        System.out.println(s);


        byte[] sendData = "hello client long time no see".getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacketSend = new DatagramPacket(sendData, sendData.length, InetAddress.getLocalHost(), 9998);
        datagramSocket.send(datagramPacketSend);

        //5.关闭资源
        datagramSocket.close();
        System.out.println("A端退出");



    }
}
