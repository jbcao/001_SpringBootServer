package com.src.practise.oob_javaSE.u_thread.multi_thread;

/**
 * 功能:演示多线程运行
 *
 * @author caojianbang
 * @date 22/11/2021 22:46
 */
public class MultiThreadTest {
    public static void main(String[] args) {
        Pig pig = new Pig(10);
        Bird bird = new Bird(10);
        Thread thread = new Thread(pig);
        Thread thread2 = new Thread(bird);
        thread.start();
        thread2.start();

    }
}
class Bird implements Runnable{
    int n=0;
    int times = 0;

    public Bird(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            times++;
            System.out.println("我是一个线程，正在输出第"+times+"个hello world");
            if (times==n){
                break;
            }
        }
    }
}

class Pig implements Runnable{
    int n = 0;
    int res = 0;
    int times= 0;

    public Pig(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            res+=(++times);
            System.out.println("当前结果是："+res);
            if (times==n){
                System.out.println("最终结果是"+res);
                break;
            }

        }

    }
}