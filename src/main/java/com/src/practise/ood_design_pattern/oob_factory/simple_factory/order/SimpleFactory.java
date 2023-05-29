package com.src.practise.ood_design_pattern.oob_factory.simple_factory.order;

import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.CheesePizza;
import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.GreekPizza;
import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.PepperPizza;
import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.Pizza;

/**
 * @author caojianbang
 * @date 2021/9/7 17:32
 */
//简单工厂类,也叫静态工厂模式
public class SimpleFactory {
    //根据orderType返回pizza对象=实例
    public Pizza createPizza(String orderType) {
       //如果不是下面这几种，就返回空
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equalsIgnoreCase("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
//将方法定义为静态更方便调用
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
