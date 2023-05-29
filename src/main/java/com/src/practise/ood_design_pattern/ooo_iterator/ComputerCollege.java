package com.src.practise.ood_design_pattern.ooo_iterator;

import java.util.Iterator;

/**
 * 这里存放的是数组
 */
public class ComputerCollege implements College {
    /**
     * 聚合 持有对象集合，可能是数组、集合等
     */
    Department[] departments;
    /**
     * 当前数组的对象个数
     */
    int numOfDepartment = 0;

    @Override
    public String getName() {
        return "计算机学院";
    }

    public ComputerCollege() {
        departments = new Department[5];
        //addDepartment方法在下面
        addDepartment("java专业", "java专业");
        addDepartment("PHP 专业", " PHP 专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment] =  new Department(name, desc);
        //注意：当前数组对象个数
        numOfDepartment += 1;
    }

    /**
     * 提供一个方法，返回一个迭代器
     * @return
     */
    @Override
    public Iterator createIterator() {
        //这里departments是成员变量
        return new ComputerCollegeIterator(departments);
    }
}
