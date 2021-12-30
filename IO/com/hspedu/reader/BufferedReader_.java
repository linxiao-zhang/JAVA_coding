package com.hspedu.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 演示bufferedReader
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/zhanglinxiao/a.txt";
        //创建BufferedReader对象
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            line = bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            //关闭流，这里只需要关闭BufferedReader,因为底层会自动的关闭节点流
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
