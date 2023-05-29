package com.src.practise.ood_design_pattern.ooc_prototype.improve;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",
                "12", "black");
        Sheep sheep2  = (Sheep)sheep.clone();
        Sheep sheep3  = (Sheep)sheep.clone();
        Sheep sheep4  = (Sheep)sheep.clone();
        Sheep sheep5  = (Sheep)sheep.clone();
        System.out.println(sheep3);
    }
}
