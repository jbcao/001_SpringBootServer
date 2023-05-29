package com.src.practise.oof_concurrency;


public class MyThread1 extends Thread {
    
    public MyThread1(String name) {
        this.setName(name);
    }

    public void run() {
        for(int i=20;i<=100;i++) {
            System.out.println(getName()+"..."+i);
        }
    }
}