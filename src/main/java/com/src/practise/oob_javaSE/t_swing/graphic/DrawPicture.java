package com.src.practise.oob_javaSE.t_swing.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * 画图片
 * 文字
 */
public class DrawPicture extends JFrame {
    DrawPanel drawPanel = null;

    public static void main(String[] args) {
        DrawPicture drawPicture = new DrawPicture();
    }


    public DrawPicture() {
        drawPanel = new DrawPanel();
        this.add(drawPanel);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class DrawPanel extends JPanel {

    public void paint(Graphics g) {
        super.paint(g);
        //画图片
        Image image = Toolkit.getDefaultToolkit().getImage("image/fruit.jpeg");
        g.drawImage(image, 0, 0, 400, 300, this);
        //画文字
        g.setColor(Color.RED);
        g.setFont(new Font("华文彩云", Font.BOLD, 30));
        g.drawString("祖国万岁", 40, 40);
    }
}