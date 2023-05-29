package com.src.practise.ood_design_pattern.oob_factory.simple_factory.order;

import com.src.practise.ood_design_pattern.oob_factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author caojianbang
 * @date 2021/9/7 23:20
 */
public class OrderPizza2 {
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza2(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        //shezhi
        this.simpleFactory = simpleFactory;
        do {
            pizza = this.simpleFactory.createPizza(getType());
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
