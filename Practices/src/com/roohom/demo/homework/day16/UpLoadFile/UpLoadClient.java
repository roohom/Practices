package com.roohom.demo.homework.day16.UpLoadFile;

import java.io.*;
import java.net.Socket;

/**
 * ClassName: UpLoadClient
 * Author: Roohom
 * Function:文件上传客户端
 * Date: 2020/8/3 20:23
 * Software: IntelliJ IDEA
 */
public class UpLoadClient {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("192.168.1.104", 9999);
            OutputStream output = client.getOutputStream();
            //本地读文件
            InputStream is = new FileInputStream("data.txt");

            System.out.println("开始上传...");
            int len =-1;
            byte[] buf = new byte[1024];
            while ((len = is.read(buf))!=-1)
            {
                //对服务端写文件
                output.write(buf,0,len);
                System.out.println("上传中...");
            }
            /*关键代码开始*/
            //不关闭客户端的输出流则会导致服务端一直阻塞
            client.shutdownOutput();
            /*关键代码结束*/
            is.close();
            //接收服务端的反馈
            InputStream input = client.getInputStream();
            byte[] newBuf = new byte[1024];
            int length = input.read(newBuf);
            String newStr = new String(newBuf,0,length);
            System.out.println(newStr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
