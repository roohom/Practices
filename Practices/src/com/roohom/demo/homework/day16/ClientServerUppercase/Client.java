package com.roohom.demo.homework.day16.ClientServerUppercase;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: ClientServerUppercase
 * Author: Roohom
 * Function:客户端
 * Date: 2020/8/3 19:45
 * Software: IntelliJ IDEA
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("192.168.34.40", 9999);
            OutputStream output = client.getOutputStream();
            InputStream input = client.getInputStream();


            //发送数据
            String str = new Scanner(System.in).next();
            output.write(str.getBytes());

            //接收数据
            byte[] buf = new byte[1024];
            int len = input.read(buf);
            String newStr = new String(buf, 0, len);
            System.out.println("客户端收到了:" + newStr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
