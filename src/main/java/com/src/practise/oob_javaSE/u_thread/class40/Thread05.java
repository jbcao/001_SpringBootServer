package com.src.practise.oob_javaSE.u_thread.class40;

/**
 * 功能
 *
 * @author caojianbang
 * @date 24/11/2021 00:26
 */
public class Thread05 {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();
        Thread thread = new Thread(ticketWindow);
        Thread thread2 = new Thread(ticketWindow);
        Thread thread3 = new Thread(ticketWindow);
        thread.start();
        thread2.start();
        thread3.start();
    }
}

class TicketWindow implements Runnable {
    private int nums = 1000;
    private Doggy doggy = new Doggy();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (doggy) {
                if (nums > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + nums + "张票");
                    nums--;
                } else {
                    // 结束
                    break;
                }
            }
        }

    }
}

class Doggy {

}