package com.src.practise.oob_callback;

public class InnerMethodCall {
    void method1(){
        System.out.println("i am method1");
        method2();
    }
    void method2(){
        System.out.println("i am method 2");
        method1();
    }

    public static void main(String[] args) {
        InnerMethodCall factoryUse =new InnerMethodCall();
        factoryUse.method2();
    }
}
