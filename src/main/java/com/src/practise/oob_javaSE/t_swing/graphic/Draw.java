package com.src.practise.oob_javaSE.t_swing.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * 演示绘图技术
 * 椭圆
 * 矩形
 * 直线
 */
public class Draw extends JFrame {
    MyPanel  myPanel =null;

    public static void main(String[] args) {
        Draw draw= new Draw();

    }

    public Draw(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(500,400);
        this.setLocation(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel{
    //重写父类函数，
    public void paint(Graphics g){
        //调用父类函数，完成初始化任务
        super.paint(g);
        System.out.println("paint方法被调用");
        //画椭圆，左上角坐标，宽，高
        g.drawOval(10,10,30,60);
        //画一条直线,起点，终点
        g.drawLine(10,10,40,10);
        //画矩形
        g.drawRect(60,60,40,50);
        g.setColor(Color.BLUE);
        g.fillRect(10,12,30,20);
        g.setColor(Color.RED);
        g.fillOval(50,50,10,20);
        //中心坐标，矩形宽长，起始弧度，终止弧度
        g.drawArc(60,60,40,50,0,90);
    }
}