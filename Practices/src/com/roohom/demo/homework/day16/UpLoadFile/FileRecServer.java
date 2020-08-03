package com.roohom.demo.homework.day16.UpLoadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: UpLoadFile
 * Author: Roohom
 * Function:文件接收服务端
 * Date: 2020/8/3 20:22
 * Software: IntelliJ IDEA
 */
public class FileRecServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();

            System.out.println("已连接的客户端IP为:" + s.getInetAddress());

            InputStream input = s.getInputStream();
            OutputStream os = new FileOutputStream("RecData.txt");

            Thread.sleep(100);
            byte[] buf = new byte[1024];
            int len;
            while ((len=input.read(buf))!=-1)
            {
                os.write(buf,0,len);
            }

            OutputStream output = s.getOutputStream();
            output.write("上传成功!".getBytes());
            os.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
