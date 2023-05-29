package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.oob.servlet_thread_not_safe;

/**
 * @author caojianbang
 * @date 2020/12/21 22:25
 */
public class ALogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");

    }
}
