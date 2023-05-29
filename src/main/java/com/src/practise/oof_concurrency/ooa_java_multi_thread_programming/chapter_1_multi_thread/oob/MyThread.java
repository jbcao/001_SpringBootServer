package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.oob;

/**
 * @author caojianbang
 * @date 2020/12/19 1:28
 *
 * 继承thread
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            //让main线程休眠100毫秒
            Thread.sleep(100);
            System.out.println("运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
