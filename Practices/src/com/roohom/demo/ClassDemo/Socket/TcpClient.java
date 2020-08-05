package com.roohom.demo.ClassDemo.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClassName: TcpClient
 * Author: Roohom
 * Function:
 * Date: 2020/8/3 15:08
 * Software: IntelliJ IDEA
 */
public class TcpClient {
    public static void main(String[] args) {
        //创建客户端对象
        try {
            Socket client = new Socket("127.0.0.1",8998);

            //使用输出流向服务端发送数据
            OutputStream output = client.getOutputStream();

            //使用输出流的write发送数据
            output.write("a client message".getBytes());

            InputStream input = client.getInputStream();
            byte[] buf = new byte[1024];
            int len = input.read(buf);//读
            //byte[] -> String
            String str = new String(buf,0,len);
            System.out.println("客户端接收到了:"+str);

            //关闭客户端
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
