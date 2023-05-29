package com.src.practise.ood_design_pattern.ooi_facade;

public class Screen {
    private static Screen ourInstance = new Screen();

    public static Screen getInstance() {
        return ourInstance;
    }

    private Screen() {
    }
    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("screen down");
    }
}
