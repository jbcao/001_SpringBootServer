package com.src.practise.ood_design_pattern.ood_builder.buildcomputer;

public abstract class ComputerBuilder {
    Computer computer = new Computer();

    abstract void buildMouse();

    abstract void buildKeyboard();

    abstract void buildHost();

    abstract void buildScreen();

    /**
     * 返回组合对象
     * @return
     */
    Computer createComputer() {

        return computer;
    }
}
