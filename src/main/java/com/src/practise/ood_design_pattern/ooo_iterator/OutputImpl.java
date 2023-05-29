package com.src.practise.ood_design_pattern.ooo_iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    /**
     * 学院集合
     */
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    /**
     * 遍历所有学院，然后调用printDepartment输出各学院的系
     */
    public void printCollege() {
        //从 collegeList 取出所有学院，java中的List已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("=====" + college.getName() + "=====");
            //得到相应的迭代器
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }

}
