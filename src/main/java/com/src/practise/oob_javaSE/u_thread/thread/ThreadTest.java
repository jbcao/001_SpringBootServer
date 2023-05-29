package com.src.practise.oob_javaSE.u_thread.thread;

/**
 * 功能
 *
 * @author caojianbang
 * @date 22/11/2021 21:42
 */
public class ThreadTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}

class Cat extends Thread {
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello word");
        }
    }
}