package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.oob.servlet_thread_not_safe;

/**
 * @author caojianbang
 * @date 2020/12/21 22:30
 */
public class Run {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
}
}
/*
* 可能得到的结果：b bb
*                b aa
*
* 1)在执行main（）方法时，很大概率是ALogin线程先执行，因为ALogin先执行start方法，
* 并且BLogin线程实例化代码需要耗时，更增大了ALogin先执行的概率
* 如果BLogin先执行，可能会得到如下两种结果
* 结果1：b bb
*        a aa
*
* 结果2：a bb
*        a aa
*
* 2)A线程执行doPost方法，userNameRef被赋值为 a,
*   if判断为true，线程停止
*
* 3）B线程执行doPost方法，userNameRef被覆盖为b,
*   if判断为false,继续执行，passwordRef被赋值，
*   输出内容为：b bb
*
* 4)A线程被唤醒后，继续执行，此时userNameRef被覆盖为b,
*   passwordRef被重新覆盖为aa,
*   输出内容为：b aa
*
*
*
*
* */