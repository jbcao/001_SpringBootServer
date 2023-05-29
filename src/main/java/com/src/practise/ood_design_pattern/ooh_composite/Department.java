package com.src.practise.ood_design_pattern.ooh_composite;

public class Department extends OrganizationComponent {
    @Override
    protected void print() {
        System.out.println(getName());
    }

    //这里的add方法和remove方法就不需要再写了
    public Department(String name, String des) {
        super(name, des);
    }

    //这个方法这里可以不用重写
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
