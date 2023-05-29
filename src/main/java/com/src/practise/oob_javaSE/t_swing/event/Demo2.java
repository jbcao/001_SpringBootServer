package com.src.practise.oob_javaSE.t_swing.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 功能：键盘控制小球移动
 *
 * @author caojianbang
 * @date 19/11/2021 13:17
 */
public class Demo2 extends JFrame {
    BallPanel ballPanel;

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
    }

    public Demo2() {
        ballPanel = new BallPanel();
        this.add(ballPanel, BorderLayout.CENTER);
        this.addKeyListener(ballPanel);
        this.setTitle("键盘控制小球移动");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class BallPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}