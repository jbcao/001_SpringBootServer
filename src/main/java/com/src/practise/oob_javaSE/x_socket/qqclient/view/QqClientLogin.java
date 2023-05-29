package com.src.practise.oob_javaSE.x_socket.qqclient.view;

import com.src.practise.oob_javaSE.x_socket.qqclient.model.QqClientUser;
import com.src.practise.oob_javaSE.x_socket.qqclient.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 功能
 *
 * @author caojianbang
 * @date 19/12/2021 17:12
 */
public class QqClientLogin extends JFrame implements ActionListener {
    JLabel jl1;
    JButton jb1, jb2, jb3;
    JPanel jp1, jp2, jp3, jp4;
    JLabel jl2, jl3, jl4, jl5;
    JTextField jtf;
    JPasswordField jpf;
    JButton jb4;
    JCheckBox jcb1, jcb2;
    JTabbedPane jtp;

    public static void main(String[] args) {
        QqClientLogin qqClientLogin = new QqClientLogin();
    }

    public QqClientLogin() {
        //北面
        jl1 = new JLabel(new ImageIcon("image/qqd.jpg"));
        //南面
        jb1 = new JButton("登陆");
        jb2 = new JButton("取消");
        jb3 = new JButton("注册");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jp4 = new JPanel();

        jp4.add(jb1);
        jp4.add(jb2);
        jp4.add(jb3);

        jp1 = new JPanel(new GridLayout(3, 3));
        jl2 = new JLabel("账号", JLabel.CENTER);
        jl3 = new JLabel("密码", JLabel.CENTER);
        jtf = new JTextField(20);
        jpf = new JPasswordField(20);

        jb4 = new JButton("清除密码");
        jl4 = new JLabel("忘记密码", JLabel.CENTER);
        jl4.setForeground(Color.blue);
        jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jl5 = new JLabel("<html><u>申请密码保护</u><html>", JLabel.CENTER);
        jl5.setForeground(Color.blue);
        jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jcb1 = new JCheckBox("隐身登陆");
        jcb2 = new JCheckBox("记住密码");
        jp2 = new JPanel();
        jp3 = new JPanel();
        jtp = new JTabbedPane();
        jtp.add(jp1, "账号登陆");
        jtp.add(jp2, "手机登陆");
        jtp.add(jp3, "邮箱登陆");
        jp1.add(jl2);
        jp1.add(jtf);
        jp1.add(jb4);
        jp1.add(jl3);
        jp1.add(jpf);
        jp1.add(jl4);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jl5);
        this.add(jl1, "North");
        this.add(jtp, "Center");
        this.add(jp4, "South");
        this.setSize(330, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb1){
            User u= new User();
            u.setUserId(this.jtf.getText());
            u.setPassword(new String(this.jpf.getPassword()));
            QqClientUser qqClientUser = new QqClientUser();
            if (qqClientUser.checkUser(u)){
                this.dispose();
                new QqFriendList(u.getUserId());
            }
        }

    }
}
