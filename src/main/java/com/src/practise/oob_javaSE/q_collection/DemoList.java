package com.src.practise.oob_javaSE.q_collection;

//先引入一个包,基本所有的集合类都在这个包里

import java.util.*;

public class DemoList {
    public static void main(String[] args) {
        //定义一个ArrayList对象
        ArrayList arrayList = new ArrayList();
        Map map = new HashMap();

        Clerk clerk = new Clerk("宋江", 23, 1566);
        Clerk clerk2 = new Clerk("吴用", 23, 1566);
        Clerk clerk3 = new Clerk("林冲", 23, 1566);
        //将对象加入到arrayList中
        arrayList.add(clerk);
        arrayList.add(clerk2);
        arrayList.add(clerk3);
        //可以放入相同的对象
        arrayList.add(clerk);
        //访问arrayList中数据（对象）
        //返回的是object类，需要强制转型
        Clerk clerk1 = (Clerk) arrayList.get(0);
        System.out.println(clerk1.getName());
        //遍历所有对象，数据
        for (int i = 0; i < arrayList.size(); i++) {
            Clerk clerk4 = (Clerk) arrayList.get(i);
            System.out.println(clerk4.getName());
        }
        System.out.println("删除吴用"
        );
        arrayList.remove(1);
        //遍历所有对象，数据
        for (int i = 0; i < arrayList.size(); i++) {
            Clerk clerk4 = (Clerk) arrayList.get(i);
            System.out.println(clerk4.getName());
        }
        arrayList.remove(1);
        //遍历所有对象，数据
        for (int i = 0; i < arrayList.size(); i++) {
            Clerk clerk4 = (Clerk) arrayList.get(i);
            System.out.println(clerk4.getName());
        }
    }
}

class Clerk {
    private String name;
    private int agr;
    private float sal;

    public String getName() {
        return name;
    }

    public Clerk setName(String name) {
        this.name = name;
        return this;
    }

    public int getAgr() {
        return agr;
    }

    public Clerk setAgr(int agr) {
        this.agr = agr;
        return this;
    }

    public float getSal() {
        return sal;
    }

    public Clerk setSal(float sal) {
        this.sal = sal;
        return this;
    }

    public Clerk(String name, int agr, float sal) {
        this.name = name;
        this.agr = agr;
        this.sal = sal;
    }
}