package com.src.practise.ood_design_pattern.ood_builder.improve;

//指挥者，动态指定制作流程,返回具体产品
public class HouseDirector {
    //聚合
    HouseBuilder houseBuilder = null;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过set传入houseBuilder
    public HouseDirector setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
        return this;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
