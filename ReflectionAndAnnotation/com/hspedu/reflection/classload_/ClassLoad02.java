package com.hspedu.reflection.classload_;

public class ClassLoad02 {
    public static void main(String[] args) {

    }
}

class A{
    //分析类加载的链接阶段-准备 field是如何处理的 linking-preparation
    //1. n1是实例属性,不是静态变量,因此在准备阶段不会分配内存
    //2. n2是静态变量, 分配内存 ,默认初始化0，而不是20
    //3. n3是static final是常量, 他和静态变量不一样， 因为一旦赋值就不变 n3=30 分配内存初始化30

    public int a1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}