package com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/8 14:22
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("LDPepperPizza");
        System.out.println("LDPepperPizza准备原材料");
    }
}
