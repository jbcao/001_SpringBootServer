package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.ooc_currentThread;

/**
 * @author caojianbang
 * @date 2020/12/22 23:07
 */
public class Run1 {
    public static void main(String[] args) {
        //currentThread()
        // 方法用于返回     代码段被哪个线程调用
        System.out.println(Thread.currentThread().getName());
    }
}
