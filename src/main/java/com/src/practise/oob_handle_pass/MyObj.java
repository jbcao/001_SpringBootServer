package com.src.practise.oob_handle_pass;

/**
 * 功能
 *
 * @author caojianbang
 * @date 30/11/2021 12:13
 */
public class MyObj {
    int a=99;
    public static void main(String[] args) {
        MyObj m = new MyObj();
        System.out.println(m.change(m.a)+"shi");//100+shi
        System.out.println(m.a);//99

    }
    public int change(int b){
        int c=(b+=1);
        System.out.println(b);//100
        return c;

    }
}
