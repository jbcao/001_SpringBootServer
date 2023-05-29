package com.src.practise.ood_design_principle.single_responsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        SingleResponsibility3 singleResponsibility1 = new SingleResponsibility3();
        SingleResponsibility3.Vehicle2 vehicle = singleResponsibility1.new Vehicle2();
        vehicle.runRoad("摩托车");
        vehicle.runAir("飞机");
        vehicle.runWater("鸭子");
    }

    /*交通工具类
        方式3
            1.这种方式没有对原有类做大的修改，只是增加了方法
            2.在类的级别上违反单一原则，但在方法级别上仍然遵守单一职责
            */

    class Vehicle2 {
        public void runRoad(String vehicle) {
            System.out.println(vehicle + "在公路上运行。。。。。");
        }
        public void runAir(String vehicle) {
            System.out.println(vehicle + "在天上运行。。。。。");
        }
        public void runWater(String vehicle) {
            System.out.println(vehicle + "在水上运行。。。。。");
        }
    }

}
