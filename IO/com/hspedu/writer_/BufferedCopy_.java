package com.hspedu.writer_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedCopy_ {
    public static void main(String[] args) throws Exception{
        String srcFile = "/Users/zhanglinxiao/a.txt";
        String destFile = "/Users/zhanglinxiao/a2.txt";
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFile));
        line = bufferedReader.readLine();
        while(line!=null){
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();



    }
}
