package com.src.practise.ood_design_pattern.ooo_iterator;

/**
 * 系
 **/
public class Department {


    private String name;
    private String des;

    public Department(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }

    public String getDes() {
        return des;
    }

    public Department setDes(String des) {
        this.des = des;
        return this;
    }
}
