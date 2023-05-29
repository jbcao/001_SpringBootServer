package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;

/**
 * 拆分窗格的使用
 */
public class EJSplitPane extends JFrame {
    //定义组件
    JSplitPane jsp;
    JList jl;
    JLabel jlb;

    public static void main(String[] args) {
        EJSplitPane ejSplitPane = new EJSplitPane();
    }

    public EJSplitPane() {

        String words[] = {"boy", "girl", "bird", "close"};
        jl = new JList(words);
        //访问路径中，正斜杠\\
        //            反斜杠/
        jlb =new JLabel(new ImageIcon("image/cb.jpg"));
        //拆分窗格，水平拆分
        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jl, jlb);
        //可以收缩变化
        jsp.setOneTouchExpandable(true);

        //加入组件，默认中间
        this.add(jsp);

        //设置窗体
        this.setTitle("金山词霸");
        this.setSize(530, 265);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
