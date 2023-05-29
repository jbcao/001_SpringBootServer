package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.oob.samenum;

/**
 * @author caojianbang
 * @date 2020/12/22 21:45
 * <p>
 * i--与System.out.println出现的非线程安全问题
 */
public class MyThread extends Thread {
    private int i = 5;

    @Override
    synchronized public void run() {
        /*
        *  虽然println方法在内部是同步的
        *
        *  但是i--操作是在进入println之前发生的，所以任然有一定概率出现非线程安全
        *
        *  推荐使用同步方法synchronized
        *
        *
        * */
        System.out.println("i= " + (i--) + " threadName= " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
