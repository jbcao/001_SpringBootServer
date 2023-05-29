package com.src.practise.oob_javaSE.r_reflect;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        Gen<String> stringGen = new Gen<String>("jjj");
        //stringGen.showTypeName();
        Gen<Bird> birdGen =new Gen<Bird>(new Bird());
        birdGen.showTypeName();
    }
}

//定义一个bird
class Bird {
    public void test1() {
        System.out.println("a");
    }

    public void count(int a, int b) {
        System.out.println(a + b);
    }
}

//定义一个类
//T传入什么类型，Gen类就是什么类型
class Gen<T> {
    private T o;

    //构造函数
    public Gen(T o) {
        this.o = o;
    }

    //得到T的类型名称
    public void showTypeName() {
        System.out.println("类型是：" + o.getClass().getName());
        //通过反射机制，可以得到T这个类型的很多信息
        Method m[] = o.getClass().getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].getName());
        }
    }
}