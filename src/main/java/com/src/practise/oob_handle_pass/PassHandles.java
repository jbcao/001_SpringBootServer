package com.src.practise.oob_handle_pass;

/**
 * 引用传递
 */

public class PassHandles {
    Integer a = 100;

    static void f(PassHandles h) {
        System.out.println("h inside f()" + h);
    }

    public static void main(String[] args) {
        PassHandles p = new PassHandles();
        System.out.println("h inside main()" + p);
        System.out.println("h inside main()" + System.identityHashCode(p));
        f(p);
    }
}
