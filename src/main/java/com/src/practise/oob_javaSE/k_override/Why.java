package com.src.practise.oob_javaSE.k_override;

/**
 * 方法覆盖有很多条件，有些书上说的比较细，总的讲有两点一定注意：
 *
 * 1、子类方法不能缩小父类方法的访问权限。父类public，子类只能public，否则范围缩小
 *
 * 2、子类的方法的返回类型，方法名称，参数，要和父类的返回类型，方法名称，参数，完全一样，否则编译出错。
 */
public class Why {
    public static void main(String[] args) {

    }
}
//动物类
class Animal{
    int age;
    String name;
    public void cry(){
        System.out.println("我是动物，不知怎么叫");
    }
}

class Cat extends Animal{
    public void cry(){
        System.out.println("miaomiao");
    }
}