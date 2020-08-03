package com.roohom.demo.homework.day16.ClientServerUppercase;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Server
 * Author: Roohom
 * Function:服务端
 * Date: 2020/8/3 19:45
 * Software: IntelliJ IDEA
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();

            System.out.println("已连接的客户端IP为:" + s.getInetAddress());

            //接收数据
            InputStream input = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = input.read(buf);
            String str = new String(buf, 0, len);
            System.out.println("接收到客户端发送的数据为:" + str);

            System.out.println("正在将其转换为大写...");

            //发回数据给客户端
            OutputStream output = s.getOutputStream();
            output.write(str.toUpperCase().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
