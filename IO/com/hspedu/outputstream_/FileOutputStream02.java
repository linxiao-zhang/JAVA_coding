package com.hspedu.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream02 {
    public static void main(String[] args) throws IOException {
        writeFile();
    }
    public static void writeFile() throws IOException {
        String filePath = "/Users/zhanglinxiao/testoutput.txt";
//        String filePath2 = "/Users/zhanglinxiao/testoutput2.txt";
        FileOutputStream fileOutputStream;
        fileOutputStream = new FileOutputStream(filePath);
//        fileOutputStream.write('H');
//        System.out.println("写入完成");
        String str = "hsp,world!";
        String str2 = "asdfg";
//        fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8),0,str.length());
        fileOutputStream.write(str2.getBytes(StandardCharsets.UTF_8),0,str2.length());

//        FileWriter fileWriter = new FileWriter(filePath2);
//        fileWriter.write(str.toCharArray());
//        fileWriter.write(str2.toCharArray());
//        fileWriter.close();

//        try {
//            fileOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
