package com.src.practise.oof_concurrency;

/**
 * 多线程的实现之一：继承 Thread 类
 * @author Administrator
 *
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            //System.out.println(Thread.currentThread().getName()+"..."+i);
            
            if(i==30) {
                MyThread1 myThread = new MyThread1("新线程");
                myThread.start();
            }
        }
    }
}