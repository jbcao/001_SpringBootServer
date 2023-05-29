package com.src.practise.ood_design_pattern.ood_builder.buildcomputer;

public class ComputerDirector {
    ComputerBuilder computerBuilder;

    public ComputerDirector setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
        return this;
    }

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    Computer constructComputer() {
        computerBuilder.buildHost();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
        computerBuilder.buildScreen();
        //这里使用的是属性
        return computerBuilder.createComputer();

    }
}
