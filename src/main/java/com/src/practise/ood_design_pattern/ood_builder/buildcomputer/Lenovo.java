package com.src.practise.ood_design_pattern.ood_builder.buildcomputer;

/**
 * 具体产品类，联想电脑
 */
public class Lenovo extends ComputerBuilder {
    @Override
    void buildMouse() {
        System.out.println("建造联想鼠标");
    }

    @Override
    void buildKeyboard() {
        System.out.println("建造联想键盘");
    }

    @Override
    void buildHost() {
        System.out.println("建造联想主机");
    }

    @Override
    void buildScreen() {
        System.out.println("建造联想屏幕");
    }
}
