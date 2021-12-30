package com.hspedu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/zhanglinxiao/ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello,world!");
        //插入一个和系统相关的换行符
        bufferedWriter.newLine();
        bufferedWriter.write("the legend of zelda");
        bufferedWriter.close();


    }
}
