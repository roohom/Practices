package com.roohom.demo.homework.day14;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName: FileMerge
 * Author: Roohom
 * Function:多个碎片文件的合并
 * Date: 2020/7/31 21:07
 * Software: IntelliJ IDEA
 */
public class FileMerge {
    public static void main(String[] args) {
        String sub_name =  "D:\\copy\\AE86_";                   //new Scanner(System.in).next();
        String merge_name = "D:\\copy\\AE86_Merge.mp4";               // new Scanner(System.in).next();

        //获取文件大小
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(merge_name));
            int size = 8;
            byte[] buf = new byte[1024 * 1024 * size];
            int len = -1;
            for (int i = 0; i < 8; i++) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sub_name+(i+1)+".mp4"));
                while ((len = bis.read(buf)) != -1) {
                    bos.write(buf,0,len);
                }
                bos.flush();
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
