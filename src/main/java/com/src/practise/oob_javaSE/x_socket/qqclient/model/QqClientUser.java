package com.src.practise.oob_javaSE.x_socket.qqclient.model;

/**
 * 功能
 *
 * @author caojianbang
 * @date 20/12/2021 12:52
 */
public class QqClientUser {
    public boolean checkUser(User u){
        return new QqClientConServer().sendLoginInfoToServer(u);
    }
}
