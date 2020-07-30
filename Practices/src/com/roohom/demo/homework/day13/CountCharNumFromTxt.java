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
            int b = -1;
            int count = 0;
            while ((b = fis.read()) != -1) {
                if (b == 97)
                    count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
