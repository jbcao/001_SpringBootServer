package com.src.practise.ood_design_pattern.ood_builder.carbuilder;

/**
 * @author caojianbang
 * @date 2021/9/17 22:06
 */
public class CarDirector {
    CarBuilder carBuilder =null;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    Car constructCar(){
        carBuilder.createEngin();
        carBuilder.createGlass();
        carBuilder.createWheel();
        return carBuilder.car;
    }
}
