package com.src.practise.ood_design_pattern.oob_factory.simple_factory.order;

/**
 * @author caojianbang
 * @date 2021/9/8 0:22
 */
public class PizzaStore2 {
    public static void main(String[] args) {
        //使用简单工厂
        new OrderPizza2(new SimpleFactory());
    }
}
