package com.src.practise.oob_javaSE.w_jdbc.my_diet.view;

import javax.swing.*;
import java.awt.*;

/**
 * 功能:首页
 *
 * @author caojianbang
 * @date 12/12/2021 02:57
 */
public class Index extends JWindow implements Runnable{
    Paint p;
    public static void main(String[] args) {
        Index index = new Index();
        Thread thread = new Thread(index);
        thread.start();
    }

    public Index() {
        p = new Paint();
        this.add(p);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(30*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.dispose();
            new UserLogin();
            break;
        }
    }
}
class Paint extends JPanel {// 可以自动刷新Panel

    public void paintComponent(Graphics g) {
        // super.paintComponent(g);
        Image image;
        image = Toolkit.getDefaultToolkit().getImage("image/diet.jpeg");// 获得背景图片
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}