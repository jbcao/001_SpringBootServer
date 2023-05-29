package com.src.practise.ood_design_pattern.ood_builder.carbuilder;

/**
 * @author caojianbang
 * @date 2021/9/17 22:06
 */
public class Client {
    public static void main(String[] args) {
        Benz benz = new Benz();
        CarDirector carDirector =new CarDirector(benz);
        Car car = carDirector.constructCar();
    }
}
