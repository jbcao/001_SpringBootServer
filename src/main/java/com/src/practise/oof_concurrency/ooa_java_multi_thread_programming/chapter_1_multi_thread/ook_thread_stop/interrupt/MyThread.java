package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.ook_thread_stop.interrupt;

/**
 * @author caojianbang
 * @date 2020/12/23 22:01
 *
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
      /*  try {
           // Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        myThread.interrupt();
        System.out.println("是否停止="+myThread.isInterrupted());
        System.out.println("是否停止="+myThread.isInterrupted());

    }
}
