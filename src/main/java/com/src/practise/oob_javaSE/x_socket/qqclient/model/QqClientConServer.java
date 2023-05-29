package com.src.practise.oob_javaSE.x_socket.qqclient.model;

import com.src.practise.oob_javaSE.x_socket.qqclient.common.Message;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


/**
 * 功能
 *
 * @author caojianbang
 * @date 20/12/2021 12:53
 */
public class QqClientConServer {
    Socket s;

    public boolean sendLoginInfoToServer(Object o) {
        boolean b = false;
        try {
            s = new Socket("127.0.0.1", 9999);
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(o);
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            Message m = (Message) ois.readObject();
            if (m.getMesType().equals("1")) {
                b = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        return b;

    }
}
