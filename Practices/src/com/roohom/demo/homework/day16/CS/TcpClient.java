package com.roohom.demo.homework.day16.CS;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: TcpClient
 * Author: Roohom
 * Function:客户端
 * Date: 2020/8/3 20:09
 * Software: IntelliJ IDEA
 */
public class TcpClient {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("192.168.34.40", 9999);
            OutputStream output = client.getOutputStream();

            //发送数据
            boolean flag = true;
            while (flag) {
                String str = new Scanner(System.in).next();
                output.write(str.getBytes());
                if (str.equals("886")) {
                    flag = false;
                    System.out.println("发送数据结束");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
