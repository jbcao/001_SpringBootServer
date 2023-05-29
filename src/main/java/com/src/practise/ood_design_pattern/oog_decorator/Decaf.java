package com.src.practise.ood_design_pattern.oog_decorator;

public class Decaf extends Coffee {
    public Decaf() {
        //调用父类方法，可以使用super也可以不使用
        super.setDes("decaf");
        setPrice(1.0f);
    }
}
