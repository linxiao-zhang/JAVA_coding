package com.hspedu.reflection.class_;

import com.hspedu.Car;

/**
 * 演示得到class对象的六种方式
 */
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.已知一个类的全类名，且该类在路径下，可通过Class类的静态方法forName()获取，多用于配置文件，读取类全路径，加载类
        String classAllPath = "com.hspedu.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        //2. 类名.class ，应用场景多用于参数传递
        System.out.println(Car.class);
        //3.通过创建好的对象，获取Class对象
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);

        //通过类加载器获取类的Class对象
        //（1）先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);
        //cls1 cls2 cls3 cls4 the same object




    }
}
