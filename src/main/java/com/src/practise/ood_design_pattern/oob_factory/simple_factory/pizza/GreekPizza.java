package com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza;

/**
 * @author caojianbang
 * @date 2021/9/7 15:27
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
