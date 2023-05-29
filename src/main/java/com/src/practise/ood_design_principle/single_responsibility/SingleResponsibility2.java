package com.src.practise.ood_design_principle.single_responsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        SingleResponsibility2 singleResponsibility2 = new SingleResponsibility2();
        RoadVehicle roadVehicle = singleResponsibility2.new RoadVehicle();
        roadVehicle.run("火车");
        AirVehicle airVehicle = singleResponsibility2.new AirVehicle();
        airVehicle.run("飞艇");
        WaterVehicle waterVehicle = singleResponsibility2.new WaterVehicle();
        waterVehicle.run("潜艇");
    }

    /* 方案2分析
         1.遵守单一职责原则
         2.但这样的改动很大，要将类分解，同时还要修改客户端
         3.改进：直接修改Vehicle类，改动的代码比较少=>方案3
         */

    class RoadVehicle {
        void run(String vehicle) {
            System.out.println(vehicle + "在路上跑");
        }
    }

    class AirVehicle {
        void run(String vehicle) {
            System.out.println(vehicle + "在天上飞");
        }
    }

    class WaterVehicle {
        void run(String vehicle) {
            System.out.println(vehicle + "在水里行驶");
        }
    }

}
