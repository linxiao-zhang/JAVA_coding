package com.hspedu.thread;

public class Thread01 {
    public static void main(String[] args) {
        //创建Cat对象当线程使用
        Cat cat = new Cat();
        cat.start();
        //说明:当main线程启动一个子线程Thread-0,主线程不会阻塞，会继续执行
        System.out.println("主线程继续执行");
        System.out.println("主线程是 " + Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println("主线程 i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
//if a class extends Class Thread, it can be used as thread
class Cat extends Thread{
    int times = 0;
    @Override
    public void run(){
        do {
            System.out.println("I am cat" + (++times) + "线程名" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (times != 8);
    }

}
