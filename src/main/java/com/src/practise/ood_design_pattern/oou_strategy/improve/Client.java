package com.src.practise.ood_design_pattern.oou_strategy.improve;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.setFlyBehavior(new NoFlyBehavior());
        wildDuck.fly();
    }
}
