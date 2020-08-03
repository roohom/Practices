package com.roohom.demo.homework.day16.ClientServerData;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: Client
 * Author: Roohom
 * Function:客户端
 * Date: 2020/8/3 19:26
 * Software: IntelliJ IDEA
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("192.168.34.40", 9999);
            OutputStream output = client.getOutputStream();
            InputStream input = client.getInputStream();

            boolean flag = true;
            while (flag) {
                String str = new Scanner(System.in).next();
                output.write(str.getBytes());
                if (str.equals("886"))
                    flag = false;

            }
            byte[] buf = new byte[1024];
            int len = input.read(buf);
            String str = new String(buf, 0, len);
            System.out.println("客户端收到了:" + str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
