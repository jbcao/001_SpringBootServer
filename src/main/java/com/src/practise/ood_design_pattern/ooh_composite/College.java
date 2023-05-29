package com.src.practise.ood_design_pattern.ooh_composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    //构造器,子类会默认继承父类的域与方法，包括构造器，如果子类没有显式调用父类构造器，，则自动调用父类无参构造器，
    // 此时如果父类没有默认构造器，，则编译器会报错
    public College(String name, String des) {
        super(name, des);
    }

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    //print方法，就是输出university所包含的学院
    @Override
    protected void print() {
        System.out.println("------------" + getName() + "-------------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    //重写add,实际业务中，collage 与university的add可能不一样
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();

    }
}
