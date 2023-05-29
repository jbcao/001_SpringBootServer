package com.src.practise.oob_javaSE.u_thread.runnable;

/**
 * 功能
 *
 * @author caojianbang
 * @date 22/11/2021 21:56
 */
public class RunnableTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("hello,world");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}