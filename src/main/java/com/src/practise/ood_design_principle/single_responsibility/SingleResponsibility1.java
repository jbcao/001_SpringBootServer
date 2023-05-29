package com.src.practise.ood_design_principle.single_responsibility;

/**
 * 单一职责原则
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        SingleResponsibility1 singleResponsibility1 = new SingleResponsibility1();
        Vehicle vehicle = singleResponsibility1.new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");

        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("野驴");
        vehicle2.run("大雁");
        vehicle2.run("鲨鱼");
    }

    /*交通工具类
        方式1
            1.在方式1的run方法中违反了单一职责原则
            2.解决方法很简单，根据交通工具运行方法的不同，分解成不同的类即可*/
    class Vehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + "在公路上运行。。。。。");
        }
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路奔跑");

    }
}