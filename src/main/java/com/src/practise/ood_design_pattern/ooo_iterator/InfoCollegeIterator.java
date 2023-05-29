package com.src.practise.ood_design_pattern.ooo_iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院以list方式存系
 */
public class InfoCollegeIterator implements Iterator {
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    /**
     * 判断集合中是否有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    /**
     * 空实现
     */
    @Override
    public void remove() {

    }
}
