package com.roohom.demo.ClassDemo.File.BufferedStream;

import java.io.*;

/**
 * ClassName: BufferedStreamDemo
 * Author: Roohom
 * Function:字符缓冲流复制文件
 * Date: 2020/7/31 12:19
 * Software: IntelliJ IDEA
 */
public class BufferedStreamDemo {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("file5.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("file6.txt",true));

            //读一行数据
//            String line = br.readLine();
//            System.out.println(line);
            //字符数组写
            char[] chs = {'我','爱','P','y','t','h','o','n'};
            bw.write(chs);

            bw.newLine();
            //字符串写
            bw.write("我爱Python");

            String str;
            while ((str=br.readLine())!=null)
            {
                bw.write(str);
                bw.newLine();
            }

//            String l;
//            while ((l=br.readLine())!=null)
//            {
//                System.out.println(l);
//            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
