package com.src.practise.ood_design_pattern.oob_factory.factory_method.order;



import com.src.practise.ood_design_pattern.oob_factory.factory_method.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author caojianbang
 * @date 2021/9/7 23:20
 */
public abstract class OrderPizza{
    /**
     * 抽象方方法
     *
     * */
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType=getType();
        do {
            //接收
            //抽象方法，具体由工厂子类完成
            pizza =createPizza(orderType);
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

    /**
     * 获取客户希望订购的披萨类别
     * @return ""
     */
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
