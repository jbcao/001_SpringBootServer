package com.src.practise.ood_design_pattern.oog_decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj){
        //TODO,这里为什么这样
        // 调用父类构造方法
        super(obj);
        setDes("chocolate");
        setPrice(3.0f);//调味品的价格
    }
}
