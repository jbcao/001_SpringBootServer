package com.src.practise.ood_design_pattern.oou_strategy.improve;

public abstract class Duck {
    //属性，策略接口
    FlyBehavior flyBehavior;

    public Duck setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this;
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
