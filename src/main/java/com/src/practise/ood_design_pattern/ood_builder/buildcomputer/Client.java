package com.src.practise.ood_design_pattern.ood_builder.buildcomputer;

public class Client {
    public static void main(String[] args) {
        Lenovo lenovo =new Lenovo();
        ComputerDirector computerDirector = new ComputerDirector(lenovo);
        computerDirector.constructComputer();
    }
}
