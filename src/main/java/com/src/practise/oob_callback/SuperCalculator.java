package com.src.practise.oob_callback;

public class SuperCalculator {
    public void add(int a,int b,Student2 xiaoming){
        int result = a+b;
        xiaoming.fillBlank(a,b,result);
    }
}
