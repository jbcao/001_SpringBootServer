package com.src.practise.ood_design_pattern.oop_monitor;

public class TestListener {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.registerListener(new MyRobotListener());
        robot.working();
        robot.dancing();
    }
}