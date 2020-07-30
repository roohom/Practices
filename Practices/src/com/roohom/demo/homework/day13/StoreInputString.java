package com.roohom.demo.homework.day13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ClassName: StoreInputString
 * Author: Roohom
 * Function:存储用户输入的字符串
 * Date: 2020/7/30 19:02
 * Software: IntelliJ IDEA
 */
public class StoreInputString {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("String.txt");
            System.out.println("请输入你想写入的内容:");
            String s = new Scanner(System.in).next();
            while (!s.equals("886")) {
                fos.write(s.getBytes());
                fos.write("\n".getBytes());
                s = new Scanner(System.in).next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
