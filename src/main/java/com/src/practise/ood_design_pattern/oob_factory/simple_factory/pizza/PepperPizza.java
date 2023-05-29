package com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza;

/**
 * @author caojianbang
 * @date 2021/9/7 17:16
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
