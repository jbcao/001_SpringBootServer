package com.src.practise.oob_javaSE.t_swing.tank_game3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

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
        Thread thread = new Thread(tankPanel);
        thread.start();
        this.addKeyListener(tankPanel);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

//画坦克的面板组件
class TankPanel extends JPanel implements KeyListener ,Runnable{
    //定义我的坦克
    Hero hero;
    Vector<Enermy> enermies = new Vector<Enermy>();
    int size = 3;

    public TankPanel() {
        hero = new Hero(100, 100);
        for (int i = 0; i < size; i++) {
            Enermy enermy = new Enermy((i + 1) * 50, 0);
            //指定颜色和方向
            enermy.setColor(0);
            enermy.setDirect(2);
            enermies.add(enermy);
        }
    }


    public void paint(Graphics g) {
        super.paint(g);
        //定义活动区域
        g.fillRect(0, 0, 400, 300);
        //画坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        //画出子弹，不能上来就画，要判断有没有
        //希望子弹跑起来，线程
        //希望程序自主连续执行，线程
         if(hero.shot!=null&&hero.shot.isAlive){
             g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
         }
        for (int i = 0; i < enermies.size(); i++) {
            drawTank(enermies.get(i).getX(), enermies.get(i).getY(), g, enermies.get(i).getDirect(), 1);
        }
    }

    /**
     * 画图片函数
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //判断坦克类型
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        //判断方向
        switch (direct) {
            case 0:
                //画坦克
                //1.画出左边矩形
                g.fill3DRect(x, y, 5, 30, false);
                //2.画出右边
                g.fill3DRect(x + 15, y, 5, 30, false);
                //3.中间矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //4.中间圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //5.画出线
                g.drawLine(x + 10, y, x + 10, y + 15);
                break;
            case 1:
                //炮筒向右
                //画出上面矩形
                g.fill3DRect(x, y, 30, 5, false);
                //画出下面矩形
                g.fill3DRect(x, y + 15, 30, 5, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //画出圆形
                g.fillOval(x + 10, y + 5, 10, 10);
                //画出直线
                g.drawLine(x + 15, y + 10, x + 30, y + 10);
                break;
            case 2:
                //向下
                g.fill3DRect(x, y, 5, 30, false);
                //2.画出右边
                g.fill3DRect(x + 15, y, 5, 30, false);
                //3.中间矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //4.中间圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //5.画出线
                g.drawLine(x + 10, y + 10, x + 10, y + 30);
                break;

            case 3:
                //炮筒向左
                //画出上面矩形
                g.fill3DRect(x, y, 30, 5, false);
                //画出下面矩形
                g.fill3DRect(x, y + 15, 30, 5, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //画出圆形
                g.fillOval(x + 10, y + 5, 10, 10);
                //画出直线
                g.drawLine(x + 15, y + 10, x, y + 10);
                break;
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //使用 asdw 四个键
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            this.hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            this.hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            this.hero.setDirect(3);
            hero.moveLeft();
        }
        //else if 进入到一个入口就不会判断第二个入口
        //判断是否按下J键
        //可能ASDW和J同时被按下，所以需要单独判断
        if (e.getKeyCode() == KeyEvent.VK_J) {
            this.hero.shotEnemy();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while(true){
            try {
                //线程休息100毫秒
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.repaint();

        }

    }
}

