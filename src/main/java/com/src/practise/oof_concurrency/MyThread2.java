package com.src.practise.oof_concurrency;


public class MyThread2 implements Runnable {
    
    public MyThread2(String name) {
        Thread.currentThread().setName(name);
    }
    
    @Override
    public void run() {
        for(int i=20;i<=100;i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
    
    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
            
            if(i==30) {
                MyThread2 myThread = new MyThread2("新线程");
                
                Thread thread = new Thread(myThread);
                
                thread.start();
            }
        }
    }
}