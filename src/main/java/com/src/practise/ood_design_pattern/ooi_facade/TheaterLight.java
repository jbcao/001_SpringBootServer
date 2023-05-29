package com.src.practise.ood_design_pattern.ooi_facade;

public class TheaterLight {
    private static TheaterLight ourInstance = new TheaterLight();

    public static TheaterLight getInstance() {
        return ourInstance;
    }

    private TheaterLight() {
    }

    public void on() {
        System.out.println("TheaterLight on");
    }

    public void off() {
        System.out.println("TheaterLight off");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }
}
