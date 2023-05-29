package com.src.practise.oob_callback;

/**
 * 序言
 *
 * 最近学习java，接触到了回调机制(CallBack)。初识时感觉比较混乱，而且在网上搜索到的相关的讲解，要么一言带过，要么说的比较单纯的像是给CallBack做了一个定义。当然了，我在理解了回调之后，再去看网上的各种讲解，确实没什么问题。但是，对于初学的我来说，缺了一个循序渐进的过程。此处，将我对回调机制的个人理解，按照由浅到深的顺序描述一下，如有不妥之处，望不吝赐教！
 *
 * 开始之前，先想象一个场景：幼稚园的小朋友刚刚学习了10以内的加法。
 *
 * 第1章. 故事的缘起
 *
 * 幼师在黑板上写一个式子 “1 + 1 = ”，由小明同学来填空。
 *
 * 该过程完全由Student类的实例对象单独完成，并未涉及回调机制。
 */

public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = null;

    public Student(String name) {
        this.name = name;
    }
    private int calcAdd(int a,int b){
        return a+b;
    }
    public void fillBlank(int a,int b){
        int result = calcAdd(a,b);
        System.out.println(name+"心算"+a+"+"+b+"="+result);
    }

    public static void main(String[] args) {
        int a =1;
        int b = 2;
        Student student = new Student("小明");
        student.fillBlank(a,b);
    }
    }
