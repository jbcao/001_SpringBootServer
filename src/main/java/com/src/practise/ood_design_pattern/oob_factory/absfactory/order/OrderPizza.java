package com.src.practise.ood_design_pattern.oob_factory.absfactory.order;

import com.src.practise.ood_design_pattern.oob_factory.absfactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author caojianbang
 * @date 2021/9/9 15:03
 */
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza=null;
        String orderType="" ;
        this.absFactory = absFactory;
        do {
            orderType=getType();
            pizza =absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("获取失败");
            }
        } while (true);
    }
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" input pizza type:");
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
