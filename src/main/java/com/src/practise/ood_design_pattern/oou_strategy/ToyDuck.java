package com.src.practise.ood_design_pattern.oou_strategy;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("toy duck");
    }

    //重写父类的所有方法
    public void quack() {
        System.out.println("toy duck can not quack");
    }

    public void swim() {
        System.out.println("toy duck can not swim");
    }

    public void fly() {
        System.out.println("toy duck cant fly");
    }
}
