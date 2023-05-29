package com.src.practise.ood_design_pattern.ood_builder.improve;


public class CommonHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("普通房子 打地基5米");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子 砌墙 20cm");
    }

    @Override
    void roofed() {
        System.out.println("普通房子 封顶");
    }
}
