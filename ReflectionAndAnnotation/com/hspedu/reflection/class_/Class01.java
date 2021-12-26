package com.hspedu.reflection.class_;

import com.hspedu.Cat;

/**
 * 对Class类的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Cat cat = new Cat();
        //对某个类的Class 类对象，在内存中只有一份，因为类只加载一次
        Class<?> cls1 = Class.forName("com.hspedu.Cat");
        Class<?> cls2 = Class.forName("com.hspedu.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class<?> cls3 = Class.forName("com.hspedu.Dog");
        System.out.println(cls3.hashCode());
        //每个类的实例都会记得自己是由哪个Class实例所生成
        //通过Class类对象可以完整地得到一个类的完整结构。通过一系列api


    }
}
