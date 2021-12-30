package com.hspedu.reflection.classload_;

/**
 * 演示 类加载初始化阶段
 */
public class ClassLoad03 {
    public static void main(String[] args) {
        //1. 加载b类，并生成b类的class对象
        //2. 链接 num=0
        //3. 初始化 clinit()
        new B();
        System.out.println(B.num);

    }
}

class B{
    static {
        System.out.println("B 静态代码块被执行");
    }

    static int num=100;


    public B(){
        System.out.println("B()的构造器被执行");
    }
}