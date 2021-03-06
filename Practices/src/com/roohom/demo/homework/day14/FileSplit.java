package com.roohom.demo.homework.day14;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName: FileSplit
 * Author: Roohom
 * Function:文件切割 按照指定份数来分
 * Date: 2020/7/31 20:49
 * Software: IntelliJ IDEA
 */
public class FileSplit {
    public static void main(String[] args) {

        System.out.print("请输入源文件路径:");
        String your_file_name = "D:\\动态桌面AE86.mp4";             // new Scanner(System.in).next();
        System.out.println(your_file_name);
        System.out.print("请输入你想命名的子文件名:");
        String subFile_name = "D:\\copy\\AE86_";                      // new Scanner(System.in).next();
        System.out.println(subFile_name);

        //获取文件大小，以判断子文件的大小
        File file = new File(your_file_name);
        //希望分成的份数
        int numberOfCopies = 8;
        //计算得到每份的大小
        int buf_size = (int) (file.length() / numberOfCopies);
        System.out.println("1~7每份的大小是:" + buf_size);

        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            //创建输入流对象来读取文件
            bis = new BufferedInputStream(new FileInputStream(your_file_name));
            int len = -1;
            byte[] buf = new byte[buf_size];
            /*核心代码开始*/
            for (int i = 0; i < numberOfCopies; i++) {
                bos = new BufferedOutputStream(new FileOutputStream(subFile_name + (i + 1) + ".mp4"));
                //注意此处使用if判断，是为了只进行一次读取和写入
                if ((len = bis.read(buf)) != -1) {
                    bos.write(buf, 0, len);
                }
                bos.flush();
            }
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
