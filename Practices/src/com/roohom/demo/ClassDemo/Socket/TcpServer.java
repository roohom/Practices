package com.roohom.demo.ClassDemo.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TcpServer
 * Author: Roohom
 * Function:
 * Date: 2020/8/3 15:07
 * Software: IntelliJ IDEA
 */
public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            //监听客户端的连接，当客户端连接成功之后，则返回socket对象
            //把此处写成循环，分配到多线程，就可以连接多设备进行多客户端聊天

            Socket s = ss.accept();
            /*
            class Task implements Runnable
            {
                Socket s = null;
                public Task(Socket s){
                    this.s = s;
                }

                @Override
                public void run() {

                }
            }

            new Thread(new Task(s));
            */

            //打印本机IP地址
            System.out.println("已连接的客户端IP为:"+s.getInetAddress().getHostAddress());

            //基于socket对象获取输入流
            //使用输入流，从客户端Socket读取数据
            InputStream input = s.getInputStream();
//            int len = -1;
            byte[] buf = new byte[1024];
            int len = input.read(buf);//读
            //打印数据 byte[] -> String
            String str = new String(buf,0,len);
            System.out.println("接收到客户端发送的数据:"+str);


            //服务端向客户端发送数据
            //回写
            OutputStream output = s.getOutputStream();
            output.write("我去，微软收购抖音?！".getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
