package com.hspedu.api;
import java.net.InetAddress;
/**
 * INetAddress的使用
 */
public class API_ {
    public static void main(String[] args) throws Exception{
        //获取本机的INetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //根据指定主机名获取InetAddress对象
        InetAddress byName = InetAddress.getByName("zhanglinxiaodeMacBook-Pro.local");
        System.out.println(byName);

        //3. 根据域名获取InetAddress对象
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);


    }
}
