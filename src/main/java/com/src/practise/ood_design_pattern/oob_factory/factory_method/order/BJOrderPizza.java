package com.src.practise.ood_design_pattern.oob_factory.factory_method.order;


import com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza.BJCheesePizza;
import com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza.BJPepperPizza;
import com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/8 15:23
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
