package com.hspedu.reflection.class_;

import com.hspedu.Car;

import java.lang.reflect.Field;

/**
 * 演示Class类的一些常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "com.hspedu.Car";
        //获取到Car类对应的class对象
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);
        System.out.println(Class.class);
        //得到包的名字
        System.out.println(cls.getPackage().getName());
        //得到类名
        System.out.println(cls.getName());
        //通过cls创建对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car); //car.toString()

        //通过反射获取属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));

        //通过反射给属性复制
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));

        //得到所有的属性
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println(f.getName());
        }


    }
}
