package com.src.practise.ood_design_pattern.today.prototype;

public class Sheep {
    private String name;
    private String age;
    private String color;

    public Sheep setName(String name) {
        this.name = name;
        return this;
    }

    public Sheep setAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep setColor(String color) {
        this.color = color;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public Sheep(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

}
