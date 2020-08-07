package com.roohom.demo.ClassDemo.File.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * ClassName: FileInputStream
 * Author: Roohom
 * Function:一次性读取多个字节的方式来读取file.txt的内容
 * Date: 2020/7/30 12:20
 * Software: IntelliJ IDEA
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Student.txt");
//            int ch = fis.read();
//            System.out.println((char) ch);

            //一次读取多个字节
            byte[] buf = new byte[1024];
//            int len = fis.read(buf);
//            System.out.println(fis.read(buf));//读到末尾了，返回-1
//            //System.out.println(Arrays.toString(buf));
//            System.out.println("len:"+len);

            int num = 0;
            while ((num = fis.read(buf)) != -1) {
                System.out.println(new String(buf, 0, num));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
