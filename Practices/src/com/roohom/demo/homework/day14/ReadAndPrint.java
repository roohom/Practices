package com.roohom.demo.homework.day14;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName: ReadAndPrint
 * Author: Roohom
 * Function:存入数据并读出来三次三个字符并拼接
 * Date: 2020/7/31 19:12
 * Software: IntelliJ IDEA
 */
public class ReadAndPrint {

    //另一种方法使用字符输出缓冲流
    public static void charSplice()
    {
        System.out.println("请输入一个字符串:");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write(new Scanner(System.in).next());
            bw.newLine();
            //切记要刷新，不然可能没数据写入到文件
            bw.flush();
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            StringBuilder str = new StringBuilder();
            String line = br.readLine();
            for (int i = 0; i < 3; i++) {
                str.append(line.charAt((int)Math.random()*line.length()));
            }
            System.out.println(str);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






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
