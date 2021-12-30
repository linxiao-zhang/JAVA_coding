package com.hspedu;

/**
 * 做成处理流/包装流
 */
public class BufferedReader_ extends Reader_{
    private Reader_ reader_;
    public BufferedReader_(Reader_ reader_){
        this.reader_ = reader_;
    }

    //让方法更灵活，多次读取文件
    public void readFiles(int num){
        for(int i=0;i<num;i++){
            reader_.readFile();
        }
    }
    //多次读取String
    public void readStrings(int num){
        for(int i=0;i<num;i++){
            reader_.readString();
        }
    }

}
