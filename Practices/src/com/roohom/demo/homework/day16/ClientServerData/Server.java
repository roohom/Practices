package com.roohom.demo.homework.day16.ClientServerData;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Server
 * Author: Roohom
 * Function:服务端
 * Date: 2020/8/3 19:26
 * Software: IntelliJ IDEA
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();

            System.out.println("已连接的客户端IP为:" + s.getInetAddress());

            InputStream input = s.getInputStream();
            boolean flag = true;
            while (flag) {
                byte[] buf = new byte[1024];
                int len = input.read(buf);
                String str = new String(buf, 0, len);
                System.out.println("接收到客户端发送的数据为:" + str);
                if (str.equals("886"))
                    flag = false;
            }

            OutputStream output = s.getOutputStream();
            output.write("收到收到!".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
