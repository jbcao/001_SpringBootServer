package com.src.practise.ood_design_pattern.today.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", "1", "white");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
