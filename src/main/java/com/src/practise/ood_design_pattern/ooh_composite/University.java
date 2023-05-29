package com.src.practise.ood_design_pattern.ooh_composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
    //构造器
    public University(String name, String des) {
        super(name, des);
    }
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
    //print方法，就是输出university所包含的学院
    @Override
    protected void print() {
        System.out.println("------------"+getName()+"-------------------");
        for (OrganizationComponent organizationComponent:organizationComponents) {
            organizationComponent.print();
        }
    }
    //重写add
    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }
    //重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public String getDes(){
        return super.getDes();

    }
}
