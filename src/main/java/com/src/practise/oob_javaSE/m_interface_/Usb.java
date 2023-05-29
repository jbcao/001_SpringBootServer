package com.src.practise.oob_javaSE.m_interface_;

public interface Usb extends A {
    int a = 1;

    /**
     * 声明方法
     * 注意：声明和定义方法时不一样的
     */
    public void start();

    public void stop();

}

interface K extends Usb{
    public void cry();
}

interface  A{
    public void e();
}
//类可以实现多个接口
class Camera implements Usb ,K{
    @Override
    public void cry() {

    }

    @Override
    public void start() {
        System.out.println("我是相机，开始工作");
    }

    @Override
    public void stop() {
        System.out.println("我是相机，停止工作");
    }

    /**
     * 当接口继承接口后，就增加了被继承的方法，需要实现
     */
    @Override
    public void e() {

    }
}

class Phone implements Usb {

    @Override
    public void start() {
        System.out.println("我是手机，开始工作");
    }

    @Override
    public void e() {

    }

    @Override
    public void stop() {
        System.out.println("我是手机，停止工作");
    }
}

class Computer {
    public void useUsb(Usb usb) {
        usb.start();
        usb.stop();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Usb.a);
        Computer computer = new Computer();
        computer.useUsb(new Phone());
    }
}