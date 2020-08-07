package com.roohom.demo.ClassDemo.File.Buffer;

import java.io.*;

/**
 * ClassName: BufferDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/30 16:56
 * Software: IntelliJ IDEA
 */
public class BufferDemo {
    public static void main(String[] args) {
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Student.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file4.txt"));

            //向file4.txt中写入数据，如果文件不存在则创建并写入
            bos.write("开始学习大数据".getBytes());
            //数据存在缓冲区内并没真实写入，所以需要刷新
            bos.flush();

            byte[] buf = new byte[1024];
            int len=bis.read(buf);
            String str = new String(buf,0,len);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
