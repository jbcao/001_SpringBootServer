package com.src.practise.ood_design_pattern.ood_builder.improve;

//抽象建造者
public abstract class HouseBuilder {
    //组合
    protected House house = new House();

    //打地基
    abstract void buildBasic();

    //砌墙
    abstract void buildWalls();

    //封顶
    abstract void roofed();

    //建好房子将产品返回
    public House buildHouse() {
        return house;
    }
}