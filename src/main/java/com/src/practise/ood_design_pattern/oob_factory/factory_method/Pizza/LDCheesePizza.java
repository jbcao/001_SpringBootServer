package com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/8 14:21
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDCheesePizza");
        System.out.println("LDCheesePizza准备原料");
    }
}
