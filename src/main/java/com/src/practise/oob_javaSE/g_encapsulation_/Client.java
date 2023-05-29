package com.src.practise.oob_javaSE.g_encapsulation_;

/**
 * @author caojianbang
 * @date 2021/10/19 21:28
 */
public class Client {
    public static void main(String[] args) {
        Clerk clerk = new Clerk("xiaoli",15,156f);
        System.out.println("薪水"+clerk.getSalary());
        //属性是私有的，，只能在当前类调用，但是可以调用公有方法
        //System.out.println("薪水"+clerk.salary);
    }
}
