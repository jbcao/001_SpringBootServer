package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.ooj_getId;

/**
 * @author caojianbang
 * @date 2020/12/23 17:03
 */
public class Test {
    public static void main(String[] args) {
        Runnable target;
        Thread thread =Thread.currentThread();
        System.out.println(thread.getName()+"\n"+thread.getId());
    }
}
