package com.src.practise.ood_design_pattern.ooo_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 假设使用list存储
 */
public class InfoCollege implements College {
    /**
     * 聚合
     *    持有对象集合
     */

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
