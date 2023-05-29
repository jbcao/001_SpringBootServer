package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_2_concurrent_access.ooc_volatile.ooc_prohibit_of_code_reordering;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caojianbang
 * @date 2021/1/11 22:19
 * <p>
 * 实现指令重排序的测试
 */
public class ReorderTest {
    private static long x = 0;
    private static long y = 0;
    private static long a = 0;
    private static long b = 0;
    private static long c = 0;
    private static long d = 0;
    private static long e = 0;
    private static long f = 0;
    private static long count = 0;

    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        Object value = list.remove(0);

        //无限循环
        for (; ; ) {
            x = 0;
            y = 0;
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            count++;
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    c = 101;
                    d = 102;
                    x = b;
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    e = 201;
                    f = 202;
                    y = a;
                }
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            String showString = "count=" + count + " " + x + " ," + y + " " + ", " + c;
            if (x == 0 && y == 0) {
                System.err.println(showString);
                break;
            } else {
                System.out.println(showString
                );
            }
        }
    }
}
