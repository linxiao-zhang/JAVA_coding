package com.hspedu.reflection;

import com.hspedu.Cat;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/*测试反射跳用的性能*/
public class Reflection02 {
    public static void main(String[] args) throws Exception {

        m1();
        m2();
        m3();

    }

    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for(int i=0;i<90000000;i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法耗时 =" +(end-start));
    }

    public static void m2() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/zhanglinxiao/Java_coding/ReflectionAndAnnotation/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        Class<?> cls = Class.forName(classfullpath);
        Method methodInfo = cls.getMethod("hi");
        Object obj = cls.newInstance();
        long start = System.currentTimeMillis();
        for(int i=0;i<90000000;i++){
            methodInfo.invoke(obj);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射耗时 = "  + (end-start));
    }


    public static void m3() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/zhanglinxiao/Java_coding/ReflectionAndAnnotation/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        Class<?> cls = Class.forName(classfullpath);
        Method methodInfo = cls.getMethod("hi");
        methodInfo.setAccessible(true);
        Object obj = cls.newInstance();
        long start = System.currentTimeMillis();
        for(int i=0;i<90000000;i++){
            methodInfo.invoke(obj);
        }
        long end = System.currentTimeMillis();
        System.out.println("优化反射耗时 = "  + (end-start));
    }

}
