package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.oob.servlet_thread_not_safe;

/**
 * @author caojianbang
 * @date 2020/12/21 22:08
 * <p>
 * servlet技术造成的非线程安全问题以及解决方案
 * <p>
 * 本类模拟成一个servlet组件
 */
public class LoginServlet {
    //private修饰的变量表示当前类可用
    private static String userNameRef;
    private static String passwordRef;

    //synchronized public static void doPost(String userName, String password) {
     public static void doPost(String userName, String password) {
        try {
            userNameRef = userName;
            if (userName.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("userNameRef= " + userNameRef + " password= " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}