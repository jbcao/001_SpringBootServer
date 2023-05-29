package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * 菜单条组件
 * 菜单组件
 * 菜单项组件
 * <p>
 * 完成记事本界面
 *
 * @author caojianbang
 * @date 2021/11/14 1:30
 */
public class HJMenuBar extends JFrame {
    JMenuBar jmb;//菜单条组件
    /**
     * 文件组定义组件
     *
     * @param args
     */
    JMenu menu1, menu2, menu3, menu4, menu5;//菜单组件主菜单：文件、编辑、格式、查看、帮助
    JMenuItem item2, item3, item4, item5, item6, item7;//菜单项组件：子菜单：新建、打开、保存、另存为、页面设置、打印、退出

    JMenu xinjian;//二级菜单
    JMenuItem file, project;


    JTextArea jta;//多行文本框组件
    JScrollPane jsp;//滚动框组件

    //工具条
    JToolBar jtb;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8;

    public static void main(String[] args) {
        HJMenuBar hjMenuBar = new HJMenuBar();
    }

    public HJMenuBar() {
        //工具条组件
        jtb = new JToolBar(JToolBar.HORIZONTAL);
        jb1 = new JButton(new ImageIcon("image/new.jpg"));
        jb1.setToolTipText("新建");//设置提示信息
        jb2 = new JButton(new ImageIcon("image/open.jpg"));
        jb2.setToolTipText("打开");
        jb3 = new JButton(new ImageIcon("image/save.jpg"));
        jb3.setToolTipText("保存");
        jb4 = new JButton(new ImageIcon("image/copy.jpg"));
        jb4.setToolTipText("复制");
        jb5 = new JButton(new ImageIcon("image/delete.jpg"));
        jb5.setToolTipText("删除");
        jb6 = new JButton(new ImageIcon("image/modify.jpg"));
        jb6.setToolTipText("编辑");
        jb7 = new JButton(new ImageIcon("image/print.jpg"));
        jb7.setToolTipText("打印");
        jb8 = new JButton(new ImageIcon("image/close.jpg"));
        jb8.setToolTipText("关闭");

        jmb = new JMenuBar();
        //主菜单
        menu1 = new JMenu("文件（F）");
        menu1.setMnemonic('F');//设置助记符
        menu2 = new JMenu("编辑(E)");
        menu2.setMnemonic('E');
        menu3 = new JMenu("格式(O)");
        menu3.setMnemonic('O');
        menu4 = new JMenu("查看(V)");
        menu4.setMnemonic('V');
        menu5 = new JMenu("帮助(H)");
        menu5.setMnemonic('H');

        //文件菜单项
        item2 = new JMenuItem("打开（0）");
        item2.setMnemonic('0');
        //设置ctrl快捷组合键
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK));
        item3 = new JMenuItem("保存（S）");
        item3.setMnemonic('S');
        item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        item4 = new JMenuItem("另存为（A）");
        item4.setMnemonic('A');
        item5 = new JMenuItem("页面设置（U）");
        item5.setMnemonic('U');
        item6 = new JMenuItem("打印（P）");
        item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        item6.setMnemonic('P');
        item7 = new JMenuItem("退出（X）");
        item7.setMnemonic('X');
        //文件--新建-子菜单
        xinjian = new JMenu("新建");
        file = new JMenuItem("文件");
        project = new JMenuItem("工程");

        //多行文本框
        jta = new JTextArea();

        //工具条组件加入按钮
        jtb.add(jb1);
        jtb.add(jb2);
        jtb.add(jb3);
        jtb.add(jb4);
        jtb.add(jb5);
        jtb.add(jb6);
        jtb.add(jb7);
        jtb.add(jb8);

        //菜单项添加到菜单组件
        xinjian.add(file);
        xinjian.add(project);

        //菜单项添加到菜单上
        menu1.add(xinjian);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.addSeparator();//设置分割线
        menu1.add(item5);
        menu1.add(item6);
        menu1.addSeparator();//设置分割线
        menu1.add(item7);

        //将菜单添加到菜单条上
        jmb.add(menu1);
        jmb.add(menu2);
        jmb.add(menu3);
        jmb.add(menu4);
        jmb.add(menu5);

        //列表框添加到滚动框上
        jsp = new JScrollPane(jta);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        //菜单条添加到窗体上
        this.setJMenuBar(jmb);

        //工具条添加
        this.add(jtb, BorderLayout.NORTH);


        //添加滚动框
        this.add(jsp);

        //设置窗体属性
        this.setTitle("记事本");
        this.setSize(1000, 800);
        this.setIconImage(new ImageIcon("image/jsb.jpg").getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
