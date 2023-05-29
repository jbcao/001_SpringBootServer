package com.src.practise.ooa_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 * @author forget406
 *
 */
public class Server {
    
    private ServerSocket serverSocket;
    
    /** 在操作系统中注册8000端口服务，并监听8000端口  */
    public Server() {
        try {
            /* public ServerSocket(int port, int backlog) 
             *  port表示端口号，backlog表示最多支持连接数  */
            serverSocket = new ServerSocket(8000, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /** 与客户端交互  */
    public void start() {
        try {
            System.out.println("等待用户链接...");
            /* 创建Socket对象: public Socket accept() 
             * 等待客户端链接，直到客户端链接到此端口  */
            Socket socket = serverSocket.accept();
            System.out.println("链接成功，可以通讯！");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
