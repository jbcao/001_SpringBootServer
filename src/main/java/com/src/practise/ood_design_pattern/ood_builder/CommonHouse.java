package com.src.practise.ood_design_pattern.ood_builder;

public class CommonHouse extends AbstractHouse {
    void buildBasic() {
        System.out.println("普通房子 打地基");
    }

    void buildWalls() {
        System.out.println("普通房子 砌墙");
    }

    void roofed() {
        System.out.println("普通房子 封顶");
    }
}
