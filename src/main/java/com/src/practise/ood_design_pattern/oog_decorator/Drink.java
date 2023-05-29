package com.src.practise.ood_design_pattern.oog_decorator;

/**
 * 代码支撑很重要
 */
public abstract class Drink {
    public String des;//描述
    private float price = 0.0f;//价格

    //计算费用的抽象方法
    //方法由子类实现
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public Drink setDes(String des) {
        this.des = des;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Drink setPrice(float price) {
        this.price = price;
        return this;
    }
}
