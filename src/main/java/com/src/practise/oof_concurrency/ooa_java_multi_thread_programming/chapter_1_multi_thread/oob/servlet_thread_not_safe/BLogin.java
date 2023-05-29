package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.oob.servlet_thread_not_safe;

/**
 * @author caojianbang
 * @date 2020/12/21 22:26
 */
public class BLogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
