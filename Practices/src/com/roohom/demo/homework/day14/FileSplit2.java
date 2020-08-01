package com.roohom.demo.homework.day14;

import java.io.*;

/**
 * ClassName: FileSplit2
 * Author: Roohom
 * Function:文件切割，按照指定大小来切割
 * Date: 2020/8/1 18:54
 * Software: IntelliJ IDEA
 */
public class FileSplit2 {
    public static void main(String[] args) {
        System.out.print("请输入源文件路径:");
        String your_file_name = "D:\\动态桌面AE86.mp4";             // new Scanner(System.in).next();
        System.out.println(your_file_name);
        System.out.print("请输入你想命名的子文件名:");
        String subFile_name = "D:\\copy\\AE86_";                      // new Scanner(System.in).next();
        System.out.println(subFile_name);

        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            //创建输入流对象来读取文件
            bis = new BufferedInputStream(new FileInputStream(your_file_name));

            int len = -1;
            //每次读取8MB
            byte[] buf = new byte[1024 * 1024 * 8];
            int i = 0;
            /*核心代码开始*/
            while ((len = bis.read(buf)) != -1) {
                bos = new BufferedOutputStream(new FileOutputStream(subFile_name + (i + 1) + ".mp4"));
                bos.write(buf, 0, len);
                i++;
            }
            bos.flush();
            bis.close();
            /*核心代码结束*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
