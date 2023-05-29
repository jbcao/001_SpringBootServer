package com.src.practise.oob_javaSE.g_abstract_;

public class Why {
    public static void main(String[] args) {

    }
}
class Animal{
    String name;
    int age;
    //这个方法永远不会用到
    public void cry(){
        System.out.println("不知道怎么叫");
    }
}

abstract class AbsAnimal{
    String name;
    int age;
    //这就是一个抽象类
   abstract public void cry();
}
class Cat extends AbsAnimal{
    @Override
    public void cry() {
        System.out.println("miaomiao");
    }
}
