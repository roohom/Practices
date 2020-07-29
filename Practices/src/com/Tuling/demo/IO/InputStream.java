package com.Tuling.demo.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: InputStream
 * Author: Roohom
 * Function:演示字节输入流
 * Date: 2020/7/29 22:13
 * Software: IntelliJ IDEA
 */
public class InputStream {
    public static void main(String[] args) {
        try {
            //创建字节输入流对象
            FileInputStream is = new FileInputStream("测试一哈.txt");

            //对文件进行读取
//            int read = is.read();
//            System.out.println((char) read);

            //read()方法当文件读取到末尾时，返回-1
//            int num = 0;
//            while((num = is.read())!=-1)
//            {
//                System.out.print((char) num);
//            }
            byte[] by= new byte[1024];
            int num = 0;
            while ((num=is.read(by))!=-1)
            {
                String str = new String(by,1,num);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
