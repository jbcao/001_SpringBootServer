package com.src.practise.oob_javaSE.t_swing.tank_game1;

import javax.swing.*;
import java.awt.*;

/**
 * 功能
 *
 * @author caojianbang
 * @date 18/11/2021 16:01
 */
public class DrawTank extends JFrame {
    TankPanel tankPanel;

    public static void main(String[] args) {
        DrawTank drawTank = new DrawTank();
    }

    public DrawTank() {
        tankPanel = new TankPanel();
        this.add(tankPanel);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

//画坦克的面板组件
class TankPanel extends JPanel {
    //定义我的坦克
    Hero hero;

    public TankPanel() {
        hero = new Hero(100, 10);
    }


    public void paint(Graphics g) {
        super.paint(g);
        //定义活动区域
        g.fillRect(0, 0, 400, 300);
        //画坦克
        drawTank(hero.getX(),hero.getY(),g,0,1);
    }
    /**
     * 画图片函数
     *
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type ){
        //判断坦克类型
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        //判断方向
        switch(direct){
            case 0:
              //画坦克
              //定义颜色
              g.setColor(Color.CYAN);
              //1.画出左边矩形
              g.fill3DRect(hero.getX(), hero.getY(), 5, 30, false);
              //2.画出右边
              g.fill3DRect(hero.getX() + 15, hero.getY(), 5, 30, false);
              //3.中间矩形
              g.fill3DRect(hero.getX() + 5, hero.getY() + 5, 10, 20, false);
              //4.中间圆形
              g.fillOval(hero.getX()+5,hero.getY()+10,10,10);
              //5.画出线
              g.drawLine(hero.getX()+10,hero.getY(),hero.getX()+10,hero.getY()+15);

        }




    }
}

//坦克类
class Tank {
    //坦克横坐标
    int x = 0;
    //坦克纵坐标
    int y = 0;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//我的坦克
class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
    }
}