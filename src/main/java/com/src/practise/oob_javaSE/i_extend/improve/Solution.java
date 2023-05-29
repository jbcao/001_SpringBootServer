package com.src.practise.oob_javaSE.i_extend.improve;

public class Solution {
    Pupil pupil = new Pupil();

}

class Stu {
    public int age;
    public int name;
    public float fee;

    public void pay(float fee) {
        this.fee = fee;
    }

    public void printName(){
        System.out.println(this.name);
    }
}

//小学生类
class Pupil extends Stu{
    private int age;
    private int name;
    private float fee;

    public void pay(float fee) {
        this.fee = fee;
    }
}

//中学生
class MiddleStu extends Stu{


    public void pay(float fee) {
        this.fee = 0.8f * fee;
    }
}

/**
 * 大学生
 */
class ColStu extends Stu {


    public void pay(float fee) {
        this.fee = 0.1f * fee;
    }
}