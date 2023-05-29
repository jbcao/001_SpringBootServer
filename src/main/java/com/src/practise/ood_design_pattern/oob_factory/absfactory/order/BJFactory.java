package com.src.practise.ood_design_pattern.oob_factory.absfactory.order;

import com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza.BJCheesePizza;
import com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza.BJPepperPizza;
import com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/9 14:57
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equalsIgnoreCase("Cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equalsIgnoreCase("Pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
