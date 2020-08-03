package com.roohom.demo.homework.day16.CS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: DataIntoText
 * Author: Roohom
 * Function:服务端
 * Date: 2020/8/3 20:09
 * Software: IntelliJ IDEA
 */
public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();

            System.out.println("已连接的客户端IP为:" + s.getInetAddress());

            //接收数据
            InputStream input = s.getInputStream();
            OutputStream os = new FileOutputStream(new File("data.txt"));
            boolean flag = true;
            while (flag) {
                byte[] buf = new byte[1024];
                int len = input.read(buf);
                String str = new String(buf, 0, len);
                System.out.println("正在将接收到的:" + str + "写入文件");
                os.write(str.getBytes());
                os.write("\r\n".getBytes());
                if (str.equals("886"))
                    flag = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
