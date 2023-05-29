package com.src.practise.ood_design_pattern.ooi_facade;

/**
 * 投影仪
 */
public class Projector {
    private static Projector ourInstance = new Projector();

    public static Projector getInstance() {
        return ourInstance;
    }

    private Projector() {

    }
    public void on(){
        System.out.println("projector on");
    }
    public void off(){
        System.out.println("projector off");
    }
    public void focus(){
        System.out.println("projector is projector");
    }
}
