package com.src.practise.ood_design_pattern.oou_strategy.improve;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("bad fly");
    }
}
