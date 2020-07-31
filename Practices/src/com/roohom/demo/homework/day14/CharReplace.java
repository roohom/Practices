package com.roohom.demo.homework.day14;

import java.io.*;

/**
 * ClassName: CharReplace
 * Author: Roohom
 * Function:将不文明字符替换
 * Date: 2020/7/31 19:55
 * Software: IntelliJ IDEA
 */
public class CharReplace {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));

            int len = -1;
            byte[] buf = new byte[1024];
            StringBuilder str = new StringBuilder();
            while ((len = bis.read(buf)) != -1) {
                str.append(new String(buf, 0, len));
            }

            str = new StringBuilder(str.toString().replace("TMD", "***"));
            str = new StringBuilder(str.toString().replace("SB", "**"));
            str = new StringBuilder(str.toString().replace("sb", "**"));
            str = new StringBuilder(str.toString().replace("TMD", "***"));

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"));

            bos.write(str.toString().getBytes());
            bos.flush();

            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
