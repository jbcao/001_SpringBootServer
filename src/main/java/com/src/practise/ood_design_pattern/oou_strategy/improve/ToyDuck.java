package com.src.practise.ood_design_pattern.oou_strategy.improve;

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
    }
}
