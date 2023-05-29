package com.src.practise.ood_design_pattern.ood_builder.carbuilder;

/**
 * @author caojianbang
 * @date 2021/9/17 22:04
 */
public abstract class CarBuilder {
   Car car= new Car();
   abstract void createWheel();
   abstract void createGlass();
   abstract void createEngin();
   Car createCar(){
       return car;
   }
}
