package com.src.practise.ooa_socket;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * @author forget406
 *
 */
public class Client {
    
    private Socket socket;
    
    /** 申请与服务器端口连接  */
    public Client() {
        try {
            /* 请求与服务器端口建立连接
             * 并申请服务器8000端口的服务*/
            socket = new Socket("localhost", 8000);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /** 与服务器交互  */
    public void start() {
        
    }
    
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}