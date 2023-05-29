package com.src.practise.ood_design_pattern.ooi_facade;

public class Stereo {
    private static Stereo ourInstance = new Stereo();

    public static Stereo getInstance() {
        return ourInstance;
    }

    private Stereo() {
    }
    public void on(){
        System.out.println("stereo on");
    }
    public void off(){
        System.out.println("stereo off");
    }
    public void up(){
        System.out.println("stereo up");
    }
}
