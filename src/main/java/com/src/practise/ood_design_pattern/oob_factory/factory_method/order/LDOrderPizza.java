package com.src.practise.ood_design_pattern.oob_factory.factory_method.order;

import com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza.*;


/**
 * @author caojianbang
 * @date 2021/9/8 15:23
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
