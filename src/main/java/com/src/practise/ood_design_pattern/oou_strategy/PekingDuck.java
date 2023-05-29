package com.src.practise.ood_design_pattern.oou_strategy;

public class PekingDuck extends Duck
{
    @Override
    public void display() {
        System.out.println("bj  duck");
    }
    //因为北京鸭不能飞翔，因此需要重写
    @Override
    public void fly(){
        System.out.println("bj duck can not fly");
    }
}
