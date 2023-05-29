package com.src.practise.ood_design_pattern.oop_monitor;


/**
 * 事件对象
 */
public class Even {

    private Robot robot;
  
   // public Even(){
        //super();
   // }
    public Even(Robot robot){
        //super();
        this.robot = robot;
    }
     
    
    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}