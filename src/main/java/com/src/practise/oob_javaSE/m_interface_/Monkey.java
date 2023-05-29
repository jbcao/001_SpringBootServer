package com.src.practise.oob_javaSE.m_interface_;

public class Monkey {
    String name;
    public void climb(){
        System.out.println("climb");
    }
}
interface Fish{
     void swim();
}
interface Bird{
     void fly();
}
class Little extends Monkey implements Fish,Bird{
    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}