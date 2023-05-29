package com.src.practise.ood_design_pattern.oon_vistor;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("man fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman fail");
    }
}
