package com.hspedu.file;

import java.io.File;
import java.io.IOException;

/**
 * create file
 */
public class FileCreate {
    public static void main(String[] args) {
        create03();

    }


    public static void create03(){
        String parent = "/Users/zhanglinxiao";
        String child = "news3.txt";
        File file = new File(parent, child);
        try {
            file.createNewFile();
            System.out.println("create file success");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
