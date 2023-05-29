package com.src.practise.ood_design_pattern.ooi_facade;

public class Popcorn {
    private static Popcorn ourInstance = new Popcorn();

    public static Popcorn getInstance() {
        return ourInstance;
    }

    private Popcorn() {
    }
    public void on(){
        System.out.println("popcorn on");
    }
    public void off(){
        System.out.println("popcorn on");
    }
    public void pop(){
        System.out.println("popcorn is poping ");
    }
}
