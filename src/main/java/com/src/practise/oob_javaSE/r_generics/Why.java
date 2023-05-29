package com.src.practise.oob_javaSE.r_generics;

import java.util.ArrayList;

/**
 * 泛型的必要性
 */
public class Why {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        arrayList.add(dog);
        arrayList.add(cat);
        //这里的类型转换出错，报运行时异常
        // Dog dog1 =(Dog)arrayList.get(1);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog);
        //如果存入其他类型，会编译报错
        //dogs.add(cat);

    }
}
class Dog{

}
class Cat{

}