package com.src.practise.ood_design_pattern.oom_command;

public class Client {
    public static void main(String[] args) {
        //创建电灯的对象(接受者)
        LightReceiver lightReceiver= new LightReceiver();
        //创建点灯开关相关命令
        LightOnCommand lightOnCommand =new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //需要一个遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("-------------按下灯开的按钮---------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-------------按下灯关的按钮---------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-------------按下灯撤销的按钮---------------");
        remoteController.undoButtonWasPushewd();
    }
}
