package com.hspedu.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反射问题的引入
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
//        根据配置文件re.properties指定信息,创建Cat对象并调用方法hi
        //
        //传统的方法 new 对象 -> 调用方法
//        Cat cat  =new Cat();
//        cat.hi();
        //尝试用文件流 -> 明白反射的价值
        //1. 使用Properties 类, 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/zhanglinxiao/Java_coding/ReflectionAndAnnotation/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath" + "=" +classfullpath);
        System.out.println("method" + "=" + method);
        //2. 传统方法不能解决，使用反射机制
        //不能new 字符串 传统的方法行不通
        //new classfullpath

        //3. 使用反射机制解决
        //(1) 加载类,返回Class类型的对象cls
        Class<?> cls = Class.forName(classfullpath);
        //(2) 通过 cls 得到你加载的类 com.hspedu.Cat的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass());
        Method method1 = cls.getMethod(method);
        method1.invoke(o);


        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));

        Constructor<?> constructor = cls.getConstructor();
        System.out.println(constructor);



    }
}
