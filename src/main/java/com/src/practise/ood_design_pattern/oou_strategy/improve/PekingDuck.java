package com.src.practise.ood_design_pattern.oou_strategy.improve;

public class PekingDuck extends Duck
{
    public PekingDuck() {
        flyBehavior=new NoFlyBehavior();
    }
}
