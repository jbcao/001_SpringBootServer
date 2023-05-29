package com.src.practise.ood_design_pattern.oob_factory.simple_factory.order;

import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.CheesePizza;
import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.GreekPizza;
import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.PepperPizza;
import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author caojianbang
 * @date 2021/9/7 15:31
 */
public class OrderPizza {
    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        //订购披萨类型
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //获取客户希望订购的披萨类别
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
