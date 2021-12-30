package com.hspedu.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath  ="/Users/zhanglinxiao/testconnection.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('H');
            fileWriter.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
