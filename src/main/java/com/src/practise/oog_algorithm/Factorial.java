package com.src.practise.oog_algorithm;

/**
 * 阶乘
 */
public class Factorial {
    public static long factorial(int n) {
        //TODO "=="和“=”的区别
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(1));
    }
}
