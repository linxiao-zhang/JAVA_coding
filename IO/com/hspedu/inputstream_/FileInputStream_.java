package com.hspedu.inputstream_;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {
        readFile01();

    }
    public static void readFile01(){
        String filePath = "/Users/zhanglinxiao/hello.txt";
        int read;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            read = fileInputStream.read();

            //create FileInputStream object to read file
            //从该输入流读取一个字节的数据.如果没有输入可用，此方法将被终止
            //如果返回-1 表示读取完毕
            while(read!=-1){
                System.out.println((char)read);
                read = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                assert fileInputStream != null;
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
