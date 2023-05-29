package com.src.practise.oob_javaSE.q_collection;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        //链表列表
        LinkedList linkedList = new LinkedList();
        Emp emp = new Emp("322", "caojianbang", 2.5f);
        Emp emp2 = new Emp("32", "caojianbang2", 2.5f);
        linkedList.addFirst(emp);
        linkedList.addFirst(emp2);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(((Emp) linkedList.get(i)).getName());
        }
    }
}
