package com.roohom.demo.ClassDemo.File.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileOutputStreamMethods
 * Author: Roohom
 * Function:使用三种方法将数据写入文件
 * Date: 2020/7/30 11:17
 * Software: IntelliJ IDEA
 */
public class FileOutputStreamMethods {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Student.txt");

            //一次写入一个
            fos.write('A');

            //一次写入多个字节
            fos.write("\nABC".getBytes());

            //一次写入多个字节数据
            byte[] buf = "\nCode Your Dream".getBytes();
            fos.write(buf,0,buf.length);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
            //弊端，当try块中程序执行发生异常时，fos.close()没有执行
            //改进见:FileOutputStremAppend.java
        }
    }
}
