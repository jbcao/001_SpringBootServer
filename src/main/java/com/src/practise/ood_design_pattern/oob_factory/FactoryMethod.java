package com.src.practise.ood_design_pattern.oob_factory;

/**
 * @author caojianbang
 * @date 2021/9/7 0:13
 * 工厂方法设计模式
 */
public class FactoryMethod {
    public static void main(String[] args) {
        FactoryMethod factoryMethod= new FactoryMethod();
        CarFactory jiLiFactory = factoryMethod.new JiLiFactory();
        jiLiFactory.sellCar().sell();
    }

    interface CarFactory{
        Car sellCar();
    }
    class JiLiFactory implements CarFactory{
        @Override
        public Car sellCar() {
            FactoryMethod factoryMethod = new FactoryMethod();
            return factoryMethod.new JiLi();
        }
    }

    class BydFacrory implements  CarFactory{
        @Override
        public Car sellCar() {
            FactoryMethod factoryMethod = new FactoryMethod();
            return factoryMethod.new BiYaDi();
        }
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
