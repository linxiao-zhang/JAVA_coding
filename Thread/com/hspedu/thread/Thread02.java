package com.hspedu.thread;

/**
 * 通过实现接口Runnable来开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog  = new Dog();
        //创建了Thread对象，把dog对象（实现Runnable接口）
        Thread thread = new Thread(dog);
        thread.start();
    }
}

//可以把Proxy类当成Thread类来对待，模拟了一个极简的Thread
class ThreadProxy implements Runnable{
    private Runnable target = null;

    @Override
    public void run() {
        if(target!=null){
            target.run();
        }

    }

    public ThreadProxy(Runnable target){
        this.target = target;
    }

    public void start(){
        start0();//真正实现多线程的方法
    }

    public void start0(){
        run();
    }
}

//通过实现Runnable接口开发线程
class Dog implements Runnable{
    int count = 0;
    @Override
    public void run(){
        while(count<10){
            System.out.println("hi" + (++count) +Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}