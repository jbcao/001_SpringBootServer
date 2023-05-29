package com.src.practise.ood_design_pattern.oou_strategy.improve;

public class WildDuck extends Duck {
  //构造器，传入FlyBehavior对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }
}
