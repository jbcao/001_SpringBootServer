package com.src.practise.oob_javaSE.n_final_;

public class Demo {
}

class AAA {
    int a=0;//不赋值就是0，不是好习惯，一般不会出错，要么给初始值，要么用构造函数初始化，不然在不同平台可能千差万别；
    //有可能指针指向空地址，程序可能会崩溃

    /**
     * 圆周率，不容更改
     */
    final float pi = 3.1415926f;
    final public void sendMes() {
        System.out.println("send message");
    }
}

final class B extends AAA {
    public B() {
        a++;
    }

    /**
     * final修饰的类，子类不能重写
     */
    public void sendMes1() {
    }
}