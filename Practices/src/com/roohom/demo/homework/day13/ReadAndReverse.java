package com.roohom.demo.homework.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: ReadAndReverse
 * Author: Roohom
 * Function:读取文件中的内容并反转后再写入原文件
 * Date: 2020/7/30 19:10
 * Software: IntelliJ IDEA
 */
public class ReadAndReverse {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("test.txt");

            int len;
            StringBuilder str = new StringBuilder();
            byte[] b = new byte[16];
            byte[] newb = new byte[6];
            while ((len = fis.read(b)) != -1) {
                str.append(new String(b, 0, len));
            }
            System.out.println(str);
            fos = new FileOutputStream("test.txt",true);

            //再从字符串尾部逐个扫描写入到text.txt中
            for (int i = str.length()-1; i >= 0; i--) {
                fos.write(str.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
