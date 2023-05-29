package com.src.practise.oob_javaSE.u_thread.class40;

/**
 * 功能:一个线程类只能启动一次
 *
 * @author caojianbang
 * @date 23/11/2021 23:55
 */
public class Thread04 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
        //cat.start();
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        //thread.start();
    }
}

class Cat extends Thread {
    public void run() {
        System.out.println("cat cat");
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        System.out.println("dog dog");
    }
}