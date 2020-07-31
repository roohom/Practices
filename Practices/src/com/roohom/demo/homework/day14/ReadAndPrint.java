package com.roohom.demo.homework.day14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * ClassName: ReadAndPrint
 * Author: Roohom
 * Function:存入数据并读出来三次三个字符并拼接
 * Date: 2020/7/31 19:12
 * Software: IntelliJ IDEA
 */
public class ReadAndPrint {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");

            System.out.println("请输入你想写入的一个字符串数据:");
            fw.write(new Scanner(System.in).next());
            fw.flush();

            FileReader fr = new FileReader("data.txt");

            char[] buf = new char[1024];
            int len = fr.read(buf);
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                str.append(buf[(int) (Math.random() * len)]);
            }
            System.out.print("随机读取三个字符并拼接的结果是:");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
