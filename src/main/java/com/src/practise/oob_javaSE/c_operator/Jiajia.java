package com.src.practise.oob_javaSE.c_operator;

/**
 * 功能:加加用法
 *
 * @author caojianbang
 * @date 30/11/2021 12:25
 */
public class Jiajia {
    static int f1(){
        int a=2;
        return a++;
    }
    static int f2(){
        int a=2;
        return ++a;
    }

    public static void main(String[] args) {
        System.out.println(f1());//2
        System.out.println(f2());//3
    }
}
