package com.roohom.demo.homework.day13;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName: CountCharNumFromTxt
 * Author: Roohom
 * Function:统计一个txt文件中的某个字符的个数
 * Date: 2020/7/30 19:32
 * Software: IntelliJ IDEA
 */
public class CountCharNumFromTxt {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.txt");
            int count = 0;

           /*
            int b = -1;
            while ((b = fis.read()) != -1) {
                if (b == 97)
                    count++;
            }
            */

            /*
            byte[] bytes = new byte[1024];
            int len = fis.read();
            //byte[] -> String
            String str = new String(bytes,0,len);

            //遍历string

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch=='a')
                    count++;
            }
            */

            //或
            //String -> char
            /*char[] chs = str.toCharArray();
            //遍历char[]
            for (int i = 0; i < chs.length; i++) {
                if (chs[i]=='a')
                    count++;
            }
             */

            byte[] buf = new byte[1024];
            int length = fis.read(buf);
            for (int i = 0; i < length; i++) {
                if (buf[i]==97)
                    count++;
            }

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
