package com.src.practise.oob_javaSE.g_encapsulation_;

/**
 * @author caojianbang
 * @date 2021/10/19 21:24
 */
public class Clerk {
    public String name;
    private int age;
    private float salary;
    public Clerk(String name,int age,float sal){
        this.name=name;
        this.age=age;
        this.salary=sal;
    }
    public float getSalary(){
        return this.salary;
    }
}
