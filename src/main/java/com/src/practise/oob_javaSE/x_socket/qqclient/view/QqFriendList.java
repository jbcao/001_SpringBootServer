package com.src.practise.oob_javaSE.x_socket.qqclient.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 功能
 *
 * @author caojianbang
 * @date 19/12/2021 19:02
 */
public class QqFriendList extends JFrame implements ActionListener,MouseListener {
    JPanel jp1, jp2, jp3, jp4, jp5, jp6, jp7, jp8, jp9;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    JLabel jl1[], jl2[], jl3[];
    JScrollPane jsp1, jsp2, jsp3;
    CardLayout cl;
    String ownId;

    public static void main(String[] args) {
        QqFriendList qqFriendList = new QqFriendList("1");
    }

    public QqFriendList(String ownId) {
        this.ownId = ownId;
        //第一个卡片
        jp1 = new JPanel(new BorderLayout());
        jb1 = new JButton("好友");
        jb2 = new JButton("陌生人");
        jb3 = new JButton("黑名单");
        jp2 = new JPanel(new GridLayout(2, 1));
        jp2.add(jb2);
        jp2.add(jb3);

        //中间
        jl1 = new JLabel[50];
        jp3 = new JPanel(new GridLayout(50, 1, 4, 4));
        for (int i = 0; i < jl1.length; i++) {
            jl1[i] = new JLabel(i + 1 + "", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
            jl1[i].addMouseListener(this);
            jp3.add(jl1[i]);
        }
        jsp1 = new JScrollPane(jp3);
        jp1.add(jsp1, "Center");
        jp1.add(jb1, "North");
        jp1.add(jp2, "South");


        //第二个卡片
        jp4 = new JPanel(new BorderLayout());
        jb4 = new JButton("好友");
        jb5 = new JButton("陌生人");
        jb6 = new JButton("黑名单");
        jp5 = new JPanel(new GridLayout(2, 1));
        jp5.add(jb4);
        jp5.add(jb5);

        //中间
        jl2 = new JLabel[30];
        jp6 = new JPanel(new GridLayout(30, 1, 4, 4));
        for (int i = 0; i < jl2.length; i++) {
            jl2[i] = new JLabel(i + 1 + "", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
            jp6.add(jl2[i]);
        }
        jsp2 = new JScrollPane(jp6);
        jp4.add(jsp2, "Center");
        jp4.add(jp5, "North");
        jp4.add(jb6, "South");

        //第三个卡片
        jp7 = new JPanel(new BorderLayout());
        jb7 = new JButton("好友");
        jb8 = new JButton("陌生人");
        jb9 = new JButton("黑名单");
        jp8 = new JPanel(new GridLayout(3, 1));
        jp8.add(jb7);
        jp8.add(jb8);
        jp8.add(jb9);

        //中间
        jl3 = new JLabel[30];
        jp9 = new JPanel(new GridLayout(30, 1, 4, 4));
        for (int i = 0; i < jl3.length; i++) {
            jl3[i] = new JLabel(i + 1 + "", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
            jp9.add(jl3[i]);
        }
        jsp3 = new JScrollPane(jp9);
        jp7.add(jp8, "North");
        jp7.add(jsp3, "Center");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);
        cl = new CardLayout();
        this.setLayout(cl);
        this.add(jp1, "0");
        this.add(jp4, "1");
        this.add(jp7, "2");

        this.setTitle(this.ownId+"在线");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((e.getSource()==jb1)||(e.getSource()==jb4)||(e.getSource()==jb7)){
            cl.show(this.getContentPane(),"0");
        }else if((e.getSource()==jb2)||(e.getSource()==jb5)||(e.getSource()==jb8)){
            System.out.println("是否按中");
            cl.show(this.getContentPane(),"1");
        }else if((e.getSource()==jb3)||(e.getSource()==jb6)||(e.getSource()==jb9)){
            cl.show(this.getContentPane(),"2");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton()==1&&e.getClickCount()==2){
            String frendNo =( (JLabel)e.getSource()).getText();
            new QqChat(ownId,frendNo);
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
