package com.src.practise.oob_javaSE.t_swing.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 功能:
 * 1、让MyPanel知道鼠标按下的消息，并且知道点击的位置(x,y)
 * 2、让MyPanel知道哪个键按下了
 * 3、让MyPanel知道鼠标移动、拖拽
 * 4、让MyPanel知道窗口变化（关闭、最小化、最大化）
 *
 * @author caojianbang
 * @date 20/11/2021 16:15
 */
public class MultiEvent extends JFrame {
    MyPanel myPanel;
    public static void main(String[] args) {
        MultiEvent multiEvent = new MultiEvent();
    }

    public MultiEvent() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.addMouseListener(myPanel);
        this.addMouseMotionListener(myPanel);
        this.addKeyListener(myPanel);
        this.addWindowListener(myPanel);
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements MouseListener,MouseMotionListener,KeyListener ,WindowListener{
    public void Paint(Graphics g) {
        super.paint(g);

    }
    //鼠标点击
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击了x:"+e.getX()+"y="+e.getY());
    }
    //鼠标按下
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下了");
    }
    //鼠标松开
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开");
    }
    //鼠标进入面板组件
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入");
    }
    //鼠标离开面板组件
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse leave");
    }
    //鼠标拖拽,点击后移动叫拖拽
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("鼠标拖拽x:"+e.getX()+"y="+e.getY());
    }
    //鼠标移动
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("鼠标移动x:"+e.getX()+"y="+e.getY());
    }
    //键输入时候，f1-f12,上下左右键无响应
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("按下了"+e.getKeyChar()+"键");
    }
    //键按下
    @Override
    public void keyPressed(KeyEvent e) {
        //getKeyChar:给出字符
        //getKeyCode:给出ascii码
        System.out.println("按下了"+e.getKeyChar()+"键");
        System.out.println(e.getKeyCode());
    }

    //键松开
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开"+e.getKeyChar()+"键");
    }
    //打开窗口
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("窗口关闭");
    }
    //窗口正在关闭
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("窗口正在关闭");
    }
    //窗口关闭了
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("窗口关闭了");
    }
    //窗口最小化
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("窗口最小化");
    }
    //恢复窗口
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("恢复窗口");
    }
    //激活窗口，又重新打开了
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("激活窗口");
    }
    //窗口停用
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("切换窗口");
    }
}