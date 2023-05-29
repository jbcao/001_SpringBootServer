package com.src.practise.oob_javaSE.l_polymorphic;

public class Demo {
    public static void main(String[] args) {
        //这样不是多态
        Cat cat = new Cat();
        cat.cry();
        Dog dog = new Dog();
        dog.cry();
        //一会儿是猫，一会儿是狗
        //这是多态
        Animal animal = new Cat();
        animal.cry();
        animal = new Dog();
        animal.cry();
        /**
         * 多重多态
         */
        Master master = new Master();
        master.feed(new Dog(),new Fish());
        master.feed(new Cat(),new Fish());
    }
}
class Master{
    /**
     * 使用多态，就可以在不同情况下使用一个方法
     * @param animal
     * @param food
     */
    public void feed(Animal animal,Food food){
        animal.eat();
        food.showName();
    }
}
class Food{
    String name;
    public void showName(){

    }
}
class Fish extends Food{
    public void showName(){
        System.out.println("yu");
    }
}class Bone extends Food{
    public void showName(){
        System.out.println("骨头");
    }
}
//动物类
class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("不知道吃什么");
    }

    public void cry() {
        System.out.println("不知道怎么叫");
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animal setAge(int age) {
        this.age = age;
        return this;
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("wangwang");
    }
    public void eat(){
        System.out.println("吃鱼");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("miaomiao");
    }
    public void eat(){
        System.out.println("吃骨头");
    }
}