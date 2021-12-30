package com.hspedu.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

        String filePath = "/Users/zhanglinxiao/story.txt";
        FileReader fileReader = null;
        int data;
        try {
            fileReader = new FileReader(filePath);
            //循环读取
            data = fileReader.read();
            while(data!=-1){
                System.out.print((char) data);
                data = fileReader.read();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
