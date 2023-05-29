package com.src.practise.ood_design_pattern.oob_factory.absfactory.order;

import com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza.*;

/**
 * @author caojianbang
 * @date 2021/9/9 15:01
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equalsIgnoreCase("Cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equalsIgnoreCase("Pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
