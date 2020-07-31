package com.roohom.demo.ClassDemo.File.BufferedStream;

import java.io.*;

/**
 * ClassName: FileCopyBuffer
 * Author: Roohom
 * Function:使用字符缓冲流复制文件
 * Date: 2020/7/31 15:01
 * Software: IntelliJ IDEA
 */
public class FileCopyBuffer {
    public static void copy2(String source, String tartget) {
        System.out.println("正在使用字符缓冲流每次读取一行的方式进行拷贝");
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(source));
            bw = new BufferedWriter(new FileWriter(tartget));
            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void copy(String source, String target) {
        System.out.println("正在使用字符缓冲流每次读取一个字节的方式进行拷贝");
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(source));
            bw = new BufferedWriter(new FileWriter(target));
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(ch);
            }
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        //path1 为被拷贝文件所在的路径
        String source = "D:\\动态桌面AE86.mp4";     //size:31.3 MB
        //path2 拷贝之后存放的路径
        String target = "D:\\copy\\";
        //rename 为你想命名的名字
        String rename = "AE86_bak.mp4";
        target = target + rename;

        long start = System.currentTimeMillis();
//        copy(source,target); //2800毫秒
        copy2(source,target); //1538毫秒
        long end = System.currentTimeMillis();
        System.out.println("本次执行使用了"+(end-start)+"毫秒");
    }
}
