package com.src.practise.oob_javaSE.e_object_oriented;

public class This {
    public static void main(String[] args) {
        Dog dog1=new Dog(2,"大黄");
        People p1=new People(dog1,23,"郭德纲");
        People p2=new People(dog1,24,"刘谦");
        p1.showName();
        p1.dog.showInfo();
    }
}

class People {
    int age;
    String name;

    Dog dog;//引用类型
    public People(Dog dog,int age,String name){
        //可读性不好，代码可读性和可维护性密切相关
        //容易混淆
        //age=age;
        //name=name;
        this.age=age; //this.age指this代词指定是成员变量age
        this.name=name; //this.name指this代词指定是成员变量name
        this.dog=dog;
    }
    public void showName() {
        System.out.println(this.name);
    }
}

class Dog{
    int age;
    String name;
    public Dog(int age,String name){
        this.age=age;
        this.name=name;
    }
    //显示狗名
    public void showInfo(){
        System.out.println("狗名叫"+this.name);
    }
}