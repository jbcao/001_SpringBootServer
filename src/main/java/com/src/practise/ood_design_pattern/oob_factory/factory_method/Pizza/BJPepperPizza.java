package com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/8 14:21
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("BJPepperPizza");
        System.out.println("BJPepperPizza准备原料");
    }
}
