package com.src.practise.oob_javaSE.m_interface_;

public class Demo {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();
        carShop.sellCar(new BMW());
        carShop.sellCar(new QQ());
        System.out.println( carShop.getMoney());
    }
}

interface Car {
    String getNme();

    int getPrice();
}

class BMW implements Car {
    @Override
    public String getNme() {
        return "BMW";
    }

    @Override
    public int getPrice() {
        return 100000;
    }
}

class QQ implements Car {
    @Override
    public String getNme() {
        return "qq";
    }

    @Override
    public int getPrice() {
        return 200000;
    }
}

class Santana implements Car {
    @Override
    public String getNme() {
        return "Santana";
    }

    @Override
    public int getPrice() {
        return 100300;
    }
}

class CarShop {
    private int money = 0;

    public void sellCar(Car car) {
        System.out.println("车型：" + car.getNme() + "单价：" + car.getPrice());
        money += car.getPrice();
    }

    public int getMoney() {
        return money;
    }
}