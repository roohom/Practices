package com.roohom.demo.homework.day14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ClassName: CountACharOfAText
 * Author: Roohom
 * Function:统计一篇文章中指定字符的个数
 * Date: 2020/7/31 19:42
 * Software: IntelliJ IDEA
 */
public class CountACharOfAText {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
            System.out.println("请输入你想查找的指定字符:");
            char ch = new Scanner(System.in).next().charAt(0);
            int l = -1;
            int count = 0;
            byte[] buf = new byte[2];
            while ((l = bis.read(buf)) != -1) {
                String str = new String(buf, 0, l);
                //System.out.println(str);
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch)
                        count++;
                }
            }
            System.out.println("搜索到的该字符共有:" + count + "个");
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
