package com.src.practise.ood_design_pattern.ooh_composite;

public abstract class OrganizationComponent {
    private String name;//名字
    private String des;//说明

    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public OrganizationComponent setName(String name) {
        this.name = name;
        return this;
    }

    public String getDes() {
        return des;
    }

    public OrganizationComponent setDes(String des) {
        this.des = des;
        return this;
    }

    protected void add(OrganizationComponent organizationComponent) {
        //默认实现，叶子结点不需要这个方法
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        //默认实现，叶子结点不需要这个方法
        throw new UnsupportedOperationException();
    }

    //方法print，做成抽象的，子类必须要实现
    protected abstract void print();

}
