package com.src.practise.oob_handle_pass;

/**
 * 引用传递
 */
public class Alias2 {
    Integer i;

    public Alias2(Integer ii) {
        i = ii;
    }

    static void f(Alias2 handle) {
        handle.i++;
    }

    public static void main(String[] args) {
        Alias2 x = new Alias2(7);
        System.out.println("x  " + x.i);//7
        System.out.println("calling f(x)");
        f(x);
        System.out.println("x  " + x.i);//8
    }


}
