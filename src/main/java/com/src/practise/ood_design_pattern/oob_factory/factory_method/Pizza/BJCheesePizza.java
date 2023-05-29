package com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/8 14:20
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("BJCheesePizza");
        System.out.println("BJCheesePizza准备材料");
    }
}
