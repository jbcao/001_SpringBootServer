package com.src.practise.ood_design_pattern.oob_factory.absfactory.order;

/**
 * @author caojianbang
 * @date 2021/9/9 15:09
 */
public class OrderStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
