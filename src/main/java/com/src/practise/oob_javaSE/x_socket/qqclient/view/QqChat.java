package com.src.practise.oob_javaSE.x_socket.qqclient.view;

import javax.swing.*;

/**
 * 功能
 *
 * @author caojianbang
 * @date 20/12/2021 11:34
 */
public class QqChat extends JFrame {
    JTextArea jta;
    JScrollPane jsp;
    JTextField jtf ;
    JButton jb;
    JPanel jp;
    String ownId,friendId;

    public static void main(String[] args) {
       // QqChat qqChat = new QqChat();
    }

    public QqChat(String ownId,String friendId) {
        this.ownId =  ownId;
        this.friendId=friendId;
        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        jp = new JPanel();
        jtf = new JTextField(25);
        jb = new JButton("发送");
        jp.add(jtf);
        jp.add(jb);
        this.add(jsp);
        this.add(jp,"South");
        this.setTitle(ownId+"正在与"+friendId+"正在聊天");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
