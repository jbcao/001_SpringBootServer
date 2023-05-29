package com.src.practise.ood_design_pattern.oog_decorator;

/**
 * 做了个缓冲层
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
