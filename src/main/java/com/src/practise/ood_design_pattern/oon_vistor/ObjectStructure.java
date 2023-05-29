package com.src.practise.ood_design_pattern.oon_vistor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人，（man,woman）
 */
public class ObjectStructure {
    //维护一个集合
    private List<Person> people = new LinkedList<>();

    //增加到List
    public void attach(Person person) {
        people.add(person);
    }

    //移除
    public void remove(Person person) {
        people.remove(person);
    }

    //显示测评情况
    /**
     * 允许访问者访问元素
     *
     */
    public void display(Action action) {
        for (Person p : people) {
            p.accept(action);
        }
    }
}
