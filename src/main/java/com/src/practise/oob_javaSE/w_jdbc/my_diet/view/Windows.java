package com.src.practise.oob_javaSE.w_jdbc.my_diet.view;

import com.src.practise.oob_javaSE.w_jdbc.my_diet.tool.ImagePanel;
import com.src.practise.oob_javaSE.w_jdbc.my_diet.tool.MyTool;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13/12/2021 01:04
 */
public class Windows extends JFrame implements ActionListener, MouseListener {
    Image im;
    JMenuBar jmb;
    JMenu jm1, jm2, jm3, jm4, jm5, jm6;
    JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5;
    ImageIcon ii1, ii2, ii3, ii4, ii5;
    JToolBar jtb;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10;
    JPanel jp1, jp2, jp3, jp4, jp5;
    JLabel time;
    Timer t;
    Image timeBg, p1bg;
    ImagePanel p1ip;
    JLabel p1l1, p1l2, p1l3, p1l4, p1l5, p1l6, p1l7, p1l8;
    JLabel p2l1, p2l2;
    JSplitPane jsp;
    CardLayout cdl2,cdl3;

    public static void main(String[] args) {
        Windows windows = new Windows();
    }

    public Windows() {
        cdl2 = new CardLayout();
        cdl3 = new CardLayout();
        //手型光标
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        //p2卡片布局
        jp2 = new JPanel(cdl2);

        p2l1 = new JLabel(new ImageIcon("image/left.jpg"));
        p2l2 = new JLabel(new ImageIcon("image/right.jpg"));


        jp2.add(p2l1, "0");
        jp2.add(p2l2, "1");
        //p3卡片布局
        jp3 = new JPanel(cdl3);
        Image image = null;
        try {
            image = ImageIO.read(new File("image/desk.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImagePanel imagePanel = new ImagePanel(image);
        EmpInfo empInfo = new EmpInfo();
        jp3.add(imagePanel,"0");
        jp3.add(empInfo,"1");
        //jp4是边界布局
        jp4 = new JPanel(new BorderLayout());
        jp4.add(jp2, "West");
        jp4.add(jp3, "Center");

        jp1 = new JPanel(new BorderLayout());
        try {
            p1bg = ImageIO.read(new File("image/p1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        p1ip = new ImagePanel(p1bg);
        p1ip.setLayout(new GridLayout(8, 1));
        p1l1 = new JLabel(new ImageIcon("image/logo.jpg"));
        p1l2 = new JLabel("人事管理", new ImageIcon("image/rsgl.png"), 0);
        p1l3 = new JLabel("登陆管理", new ImageIcon("image/dl.png"), 0);
        p1l4 = new JLabel("菜谱价格", new ImageIcon("image/jglr.png"), 0);
        p1l5 = new JLabel("报表统计", new ImageIcon("image/bbtj.png"), 0);
        p1l6 = new JLabel("成本及库房", new ImageIcon("image/cbkz.png"), 0);
        p1l7 = new JLabel("系统设置", new ImageIcon("image/xtsz.png"), 0);
        p1l8 = new JLabel("动画帮助", new ImageIcon("image/dh.png"), 0);

        p1l2.setEnabled(false);
        p1l3.setEnabled(false);
        p1l4.setEnabled(false);
        p1l5.setEnabled(false);
        p1l6.setEnabled(false);
        p1l7.setEnabled(false);
        p1l8.setEnabled(false);
        //鼠标移动到label上显示手型
        p1l1.setCursor(cursor);
        p1l2.setCursor(cursor);
        p1l3.setCursor(cursor);
        p1l4.setCursor(cursor);
        p1l5.setCursor(cursor);
        p1l6.setCursor(cursor);
        p1l7.setCursor(cursor);
        p1l8.setCursor(cursor);

        p1ip.add(p1l1);
        p1ip.add(p1l2);
        p1ip.add(p1l3);
        p1ip.add(p1l4);
        p1ip.add(p1l5);
        p1ip.add(p1l6);
        p1ip.add(p1l7);
        p1ip.add(p1l8);
        p1l1.addMouseListener(this);
        p1l2.addMouseListener(this);
        p1l3.addMouseListener(this);
        p1l4.addMouseListener(this);
        p1l5.addMouseListener(this);
        p1l6.addMouseListener(this);
        p1l7.addMouseListener(this);
        p1l8.addMouseListener(this);

        jp1.add(p1ip);

        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, jp1, jp4);
        jsp.setDividerLocation(120);
        jsp.setDividerSize(0);
        jp5 = new JPanel(new BorderLayout());
        t = new Timer(1000, this);
        t.start();
        time = new JLabel("当前时间:" + Calendar.getInstance().getTime() + "   ");
        time.setFont(MyTool.f2);
        try {
            timeBg = ImageIO.read(new File("image/bj.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImagePanel ip = new ImagePanel(timeBg);
        ip.setLayout(new BorderLayout());
        ip.add(time, "East");
        jp5.add(ip);


        jtb = new JToolBar();
        jtb.setFloatable(false);
        jb1 = new JButton(new ImageIcon("image/qh.png"));
        jb2 = new JButton(new ImageIcon("image/qhjm.png"));
        jb3 = new JButton(new ImageIcon("image/dl.png"));
        jb4 = new JButton(new ImageIcon("image/rl.png"));
        jb5 = new JButton(new ImageIcon("image/rsgl.png"));
        jb6 = new JButton(new ImageIcon("image/jglr.png"));
        jb7 = new JButton(new ImageIcon("image/bbtj.png"));
        jb8 = new JButton(new ImageIcon("image/cbkz.png"));
        jb9 = new JButton(new ImageIcon("image/bz.png"));
        jb10 = new JButton(new ImageIcon("image/tc.png"));
        jb1.setToolTipText("切换用户");
        jb2.setToolTipText("切换界面");
        jb3.setToolTipText("登陆管理");
        jb4.setToolTipText("万年历");
        jb5.setToolTipText("人事管理");
        jb6.setToolTipText("菜谱及价格录入");
        jb7.setToolTipText("报表统计");
        jb8.setToolTipText("成本控制");
        jb9.setToolTipText("帮助");
        jb10.setToolTipText("退出系统");
        jtb.add(jb1);
        jtb.add(jb2);
        jtb.add(jb3);
        jtb.add(jb4);
        jtb.add(jb5);
        jtb.add(jb6);
        jtb.add(jb7);
        jtb.add(jb8);
        jtb.add(jb9);
        jtb.add(jb10);
        ii1 = new ImageIcon("image/qh.png");
        ii2 = new ImageIcon("image/sk.png");
        ii3 = new ImageIcon("image/dl.png");
        ii4 = new ImageIcon("image/rl.png");
        ii5 = new ImageIcon("image/tc.png");
        jmb = new JMenuBar();
        jm1 = new JMenu("系统管理");
        jm2 = new JMenu("人事管理");
        jm3 = new JMenu("菜单服务");
        jm4 = new JMenu("报表统计");
        jm5 = new JMenu("成本与库存");
        jm6 = new JMenu("帮助");
        jm1.setFont(MyTool.f1);
        jm2.setFont(MyTool.f1);
        jm3.setFont(MyTool.f1);
        jm4.setFont(MyTool.f1);
        jm5.setFont(MyTool.f1);
        jm6.setFont(MyTool.f1);
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);
        jmb.add(jm6);
        jmi1 = new JMenuItem("切换用户", ii1);
        jmi2 = new JMenuItem("切换首款界面", ii2);
        jmi3 = new JMenuItem("登陆管理", ii3);
        jmi4 = new JMenuItem("万年历", ii4);
        jmi5 = new JMenuItem("退出", ii5);
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.addSeparator();
        jm1.add(jmi3);
        jm1.add(jmi4);
        jm1.add(jmi5);
        this.setJMenuBar(jmb);
        Container ct = this.getContentPane();
        ct.add(jtb, "North");
        ct.add(jsp, "Center");
        ct.add(jp5, "South");
        try {
            im = ImageIO.read(new File("image/jb.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int w = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(w * 3 / 4, h * 4 / 5);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Super Bang 桌面系统");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.time.setText("当前时间:" + Calendar.getInstance().getTime().toString() + "   ");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==p1l1){
            cdl3.show(jp3,"0");
        }else if(e.getSource()==p1l2){
            cdl3.show(jp3,"1");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == p1l2) {
            p1l2.setEnabled(true);

        } else if (e.getSource() == p1l3) {
            p1l3.setEnabled(true);
        } else if (e.getSource() == p1l4) {
            p1l4.setEnabled(true);
        } else if (e.getSource() == p1l5) {
            p1l5.setEnabled(true);
        } else if (e.getSource() == p1l6) {
            p1l6.setEnabled(true);
        } else if (e.getSource() == p1l7) {
            p1l7.setEnabled(true);
        } else if (e.getSource() == p1l8) {
            p1l8.setEnabled(true);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == p1l2) {
            p1l2.setEnabled(false);

        } else if (e.getSource() == p1l3) {
            p1l3.setEnabled(false);
        } else if (e.getSource() == p1l4) {
            p1l4.setEnabled(false);
        } else if (e.getSource() == p1l5) {
            p1l5.setEnabled(false);
        } else if (e.getSource() == p1l6) {
            p1l6.setEnabled(false);
        } else if (e.getSource() == p1l7) {
            p1l7.setEnabled(false);
        } else if (e.getSource() == p1l8) {
            p1l8.setEnabled(false);
        }
    }
}
