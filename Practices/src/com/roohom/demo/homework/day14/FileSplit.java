package com.roohom.demo.homework.day14;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName: FileSplit
 * Author: Roohom
 * Function:文件切割
 * Date: 2020/7/31 20:49
 * Software: IntelliJ IDEA
 */
public class FileSplit {
    public static void main(String[] args) {

        System.out.print("请输入源文件路径:");
        String your_file_name = new Scanner(System.in).next();
        System.out.print("请输入你想命名的子文件名:");
        String subFile_name = new Scanner(System.in).next();

        try {
            //创建输入流对象来读取文件
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(your_file_name));

            BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream(subFile_name + "1" + ".mp4"));
            BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream(subFile_name + "2" + ".mp4"));
            BufferedOutputStream bos3 = new BufferedOutputStream(new FileOutputStream(subFile_name + "3" + ".mp4"));
            BufferedOutputStream bos4 = new BufferedOutputStream(new FileOutputStream(subFile_name + "4" + ".mp4"));

            int len = -1;
            int size = 8;
            byte[] buf = new byte[1024 * 1024 * size];
            if ((len = bis.read(buf)) != -1) {
                bos1.write(buf);
                bos1.flush();
            }
            if ((len = bis.read(buf)) != -1) {
                bos2.write(buf);
                bos2.flush();
            }
            if ((len = bis.read(buf)) != -1) {
                bos3.write(buf);
                bos3.flush();
            }
            if ((len = bis.read(buf)) != -1) {
                bos4.write(buf);
                bos4.flush();
            }

            bis.close();
            bos1.close();
            bos2.close();
            bos3.close();
            bos4.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
