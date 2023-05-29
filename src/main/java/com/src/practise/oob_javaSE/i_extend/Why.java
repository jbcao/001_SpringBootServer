package com.src.practise.oob_javaSE.i_extend;

/**
 * 功能：说明继承必要性
 */
public class Why {
    public static void main(String[] args) {

    }
}
//小学生类
class Pupil{
    private int age;
    private int name;
    private  float fee;

    public void pay(float fee){
        this.fee=fee;
    }
}
//中学生
class MiddleStu{
    private int age;
    private int name;
    private  float fee;

    public void pay(float fee){
        this.fee=0.8f*fee;
    }
}

/**
 * 大学生
 */
class ColStu{
    private int age;
    private int name;
    private  float fee;

    public void pay(float fee){
        this.fee=0.1f*fee;
    }
}