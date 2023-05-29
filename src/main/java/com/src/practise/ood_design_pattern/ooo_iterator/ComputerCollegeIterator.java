package com.src.practise.ood_design_pattern.ooo_iterator;

import java.util.Iterator;

/**
 * 前提：我们需要Department是以什么样的方式存放的
 */
public class ComputerCollegeIterator implements Iterator {
    /**
     * 假设是数组
     */
    Department[] departments;

    /**
     * 遍历的位置
     */
    int position = 0;



    /**
     * 你不传给我，我无法迭代
     * @param departments
     */

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 假设数组有3个元素
     *  0 1 2
     *  当=2时候
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length-1|| departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        //position += 1必须放在此处，不能放在hasNext（）中
        //todo
        position += 1;
        return department;
    }

    /**
     * 删除方式不需要
     */
    @Override
    public void remove() {

    }
}
