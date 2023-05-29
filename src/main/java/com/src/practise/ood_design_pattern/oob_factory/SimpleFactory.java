package com.src.practise.ood_design_pattern.oob_factory;

import org.apache.commons.lang.StringUtils;

/**
 * @author caojianbang
 * @date 2021/9/6 19:24
 * <p>
 * 简单工厂模式
 * 概念：简单工厂模式相当于是一个工厂中有各种产品，创建在一个类中，客户无需知道具体产品的名称，只需要知道产品类所对应的参数即可。
 * 通过一个参数来创建对象
 * 例子：卖车
 * 缺点：当类型过多时候不利于系统的扩展
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Car car = SimpleFactory.sellCar("比亚迪");
        car.sell();
    }

    static Car sellCar(String name) {
        SimpleFactory simpleFactory = new SimpleFactory();
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        if (name.equals("比亚迪")) {
            return simpleFactory.new BiYaDi();
        }
        if (name.equals("吉利")) {
            return simpleFactory.new JiLi();
        }
        return null;
    }

    interface Car {
        void sell();
    }

    class JiLi implements Car {

        @Override
        public void sell() {
            System.out.println("吉利出售");
        }
    }

    class BiYaDi implements Car {

        @Override
        public void sell() {
            System.out.println("比亚迪出售");
        }
    }
}
