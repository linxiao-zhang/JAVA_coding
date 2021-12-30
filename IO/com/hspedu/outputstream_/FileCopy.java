package com.hspedu.outputstream_;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    /**
     * 在进行复制时，应该读取部分数据，就写入指定文件，使用循环
     */
    public static void main(String[] args) throws IOException{
        String sourceFile = "/Users/zhanglinxiao/a.txt";
        String desFile = "/Users/zhanglinxiao/brick/test.txt";
        int readLen;
        byte[] buffer  = new byte[1024];
        try (FileOutputStream fileOutputStream = new FileOutputStream(desFile, true);  FileInputStream fileInputStream = new FileInputStream(sourceFile)) {
            readLen = fileInputStream.read(buffer);
            while (readLen != -1) {
                fileOutputStream.write(buffer, 0, readLen);
                readLen = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
