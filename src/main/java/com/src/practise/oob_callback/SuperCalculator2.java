package com.src.practise.oob_callback;

public class SuperCalculator2 {
    public  void add(int a,int b,DoJob customer){
        int result = a+b;
        customer.fillBlank(a,b,result);
    }
}
