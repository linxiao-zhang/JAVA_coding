package com.hspedu.thread;

/**
 * main线程启动两个子线程
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);
        thread.start();
        thread1.start();

    }
}


class T1 implements Runnable{

    @Override
    public void run() {
        //每隔1s输出hello world,输出10次
        int times = 0;
        while(times<10){
            System.out.println("hello world!");
            times ++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


class T2 implements Runnable{

    @Override
    public void run() {
        int times = 0;
        while(times<5){
            System.out.println("hi");
            times ++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}