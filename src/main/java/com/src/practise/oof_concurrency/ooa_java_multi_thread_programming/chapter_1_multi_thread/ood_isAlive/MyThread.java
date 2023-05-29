package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.ood_isAlive;

/**
 * @author caojianbang
 * @date 2020/12/23 14:20
 *
 * isAlive方法表示返回该线程是否处于存活状态
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+this.isAlive());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin " +myThread.isAlive());
        myThread.start();
        System.out.println("end " +myThread.isAlive());
    }
}
