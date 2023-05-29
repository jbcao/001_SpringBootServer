package com.src.practise.ood_design_pattern.oon_vistor;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
