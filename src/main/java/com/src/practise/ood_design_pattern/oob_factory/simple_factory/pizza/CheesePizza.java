package com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza;

/**
 * @author caojianbang
 * @date 2021/9/7 15:25
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
