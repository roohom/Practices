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
        String file_name1 = new Scanner(System.in).next();
        String file_name2 = new Scanner(System.in).next();
        String file_name3 = new Scanner(System.in).next();
        String file_name4 = new Scanner(System.in).next();
        String file_name = new Scanner(System.in).next();
        try {
            BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(file_name1));
            BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(file_name2));
            BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream(file_name3));
            BufferedInputStream bis4 = new BufferedInputStream(new FileInputStream(file_name4));

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_name));
            int size = 8;
            byte[] buf = new byte[1024 * 1024 * size];
            int len = -1;
            while ((len = bis1.read()) != -1) {
                bos.write(buf);
            }
            bos.flush();
            while ((len = bis2.read()) != -1) {
                bos.write(buf);
            }
            bos.flush();
            while ((len = bis3.read()) != -1) {
                bos.write(buf);
            }
            bos.flush();
            while ((len = bis4.read()) != -1) {
                bos.write(buf);
            }
            bos.flush();

            bis1.close();
            bis2.close();
            bis3.close();
            bis4.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
