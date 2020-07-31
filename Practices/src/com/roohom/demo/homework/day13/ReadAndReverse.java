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
            while ((len = fis.read(b)) != -1) {
                str.append(new String(b, 0, len));
            }
            System.out.println(str);
            fos = new FileOutputStream("test.txt",true);

            //再从字符串尾部逐个扫描写入到text.txt中
            for (int i = str.length()-1; i >= 0; i--) {
                fos.write(str.charAt(i));
            }
            //另一种方法:
            //反转:Collection工具类和StringBuilder类
            //byte[] -> String

            //使用String->StringBuilder->String
            //StringBuilder类的reverse()方法
            /*byte[] bytes = new byte[100];
            len = fis.read(bytes);
            StringBuilder str1 = new StringBuilder();
            str1.append(new String(b,0,len));
            String str2 = new StringBuilder(str1).reverse().toString();
            */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
