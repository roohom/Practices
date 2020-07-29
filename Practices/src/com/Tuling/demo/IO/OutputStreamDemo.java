package com.Tuling.demo.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ClassName: OutputStreamDemo
 * Author: Roohom
 * Function:OutputStream利用字节输出流向指定文件中写入“Hello World字符串”
 * Date: 2020/7/29 21:41
 * Software: IntelliJ IDEA
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        try {
            //创建字节输出流对象 如果文件不存在会创建文件
            OutputStream os= new FileOutputStream("测试一哈.txt",true);
            //第一种 写入int类型
            os.write(97);

            //第二种 写入String类型
            os.write("Hello World".getBytes());

            //第三种 写入
            os.write("helloworld".getBytes(),0,3);
            //释放资源


            for (int i = 0; i < 3; i++) {
                os.write("HELLOWORLD".getBytes());
                os.write("\n".getBytes());
            }
            //释放资源
            //关闭此文件输出流并释放与此流有关的所有系统资源
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
