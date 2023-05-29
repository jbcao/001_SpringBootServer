package com.src.practise.oob_javaSE.x_socket.qqserver.model;

import com.src.practise.oob_javaSE.x_socket.qqclient.common.Message;
import com.src.practise.oob_javaSE.x_socket.qqclient.model.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能
 *
 * @author caojianbang
 * @date 20/12/2021 13:37
 */
public class MyQqServer {
    public static void main(String[] args) {

    }

    public MyQqServer() {
        try {
            ServerSocket  ss = new ServerSocket(9999);
            while(true){
                Socket s = ss.accept();
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        User  u = (User) ois.readObject();
                Message m = new Message();
                ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                if (u.getPassword().equals("123456")){
                    m.setMesType("1");
                    oos.writeObject(m);
                }else {
                    m.setMesType("1");
                    oos.writeObject(m);
                    s.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
