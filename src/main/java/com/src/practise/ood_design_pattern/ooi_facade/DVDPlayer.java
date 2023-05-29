package com.src.practise.ood_design_pattern.ooi_facade;

public class DVDPlayer {
    private static DVDPlayer ourInstance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return ourInstance;
    }

    private DVDPlayer() {
    }
    public void on(){
        System.out.println("dvd on");
    }
    public void off(){
        System.out.println("dvd off");
    }
    public void play(){
        System.out.println("dvd playing");
    }public void pause(){
        System.out.println("dvd pause");
    }
}
