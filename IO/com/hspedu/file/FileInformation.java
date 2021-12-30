package com.hspedu.file;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        info();

    }
    //获取文件的信息
    public static void info(){
        File file = new File("/Users/zhanglinxiao/new1.txt");

        //调用相应的方法得到对应信息
        System.out.println("文件名字=" + file.getName());
        System.out.println("绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小(字节  )=" + file.length());
        System.out.println("文件是否存在" + file.exists());
        System.out.println("是不是一个文件" + file.isFile());
        System.out.println("是不是一个目录" + file.isDirectory());

    }
}
