package com.roohom.demo.homework.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ClassName: VerifyCode
 * Author: Roohom
 * Function:从文件中取出验证码(字符串)验证
 * Date: 2020/7/30 19:47
 * Software: IntelliJ IDEA
 */
public class VerifyCode {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("data.txt");
            //fos = new FileOutputStream("data.txt",true);
            //先写入用户录入的三个验证码
            System.out.println("请随机输入三个验证码:");
            for (int i = 0; i < 3; i++) {
                fos.write((new Scanner(System.in).next() + "\n").getBytes());
            }

            System.out.println("下面请你输入一个字符来验证你输入的对不对:");
            String input = new Scanner(System.in).next();
            int b = -1;
            StringBuilder str = new StringBuilder();

            do {
                if ((b = fis.read()) != '\r') {
                    str.append((char) b);
                } else {
                    if (str.toString().equals(input)) {
                        System.out.println("恭喜你，验证成功！");
                        break;
                    }
                    str = new StringBuilder();
                }
                if (b == -1)
                    System.out.println("验证失败！");
            } while ((b != -1));
            /*
            //另一种 这种方式应用更广泛
            byte[] buf = new byte[1024];
            int len = fis.read(buf);
            String string = new String(buf, 0, len);
            String strs[] = string.split("\r\n");

            int count = 0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] != null) {
                    if (strs[i].equals(input)) {
                        System.out.println("成功");
                        break;
                    } else
                        count++;
                }
            }
            if (count == 3)
                System.out.println("失败");

            */
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
