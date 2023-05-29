package com.src.practise.ood_design_pattern.oon_vistor;

public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());

        //成功
        Success success = new Success();
        objectStructure.display(success);

    }
}
