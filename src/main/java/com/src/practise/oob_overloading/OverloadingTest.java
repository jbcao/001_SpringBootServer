package com.src.practise.oob_overloading;

class OverloadingTest {
    int height;
    OverloadingTest() {
        System.out.println("无参数构造函数");
        height = 4;
    }
    OverloadingTest(int i) {
        System.out.println("房子高度为 " + i + " 米");
        height = i;
    }
    void info() {
        System.out.println("房子高度为 " + height + " 米");
    }
    void info(String s) {
        System.out.println(s + ": 房子高度为 " + height + " 米");
    }


    public static void main(String[] args) {
        OverloadingTest t = new OverloadingTest(3);
        t.info();
        t.info("重载方法");
        //重载构造函数
        new OverloadingTest();
    }
}