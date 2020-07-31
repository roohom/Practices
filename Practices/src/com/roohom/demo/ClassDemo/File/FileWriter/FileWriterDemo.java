package com.roohom.demo.ClassDemo.File.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileWriterDemo
 * Author: Roohom
 * Function:FileWriter的演示
 * Date: 2020/7/31 10:24
 * Software: IntelliJ IDEA
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("fileWriter.txt");

            fw.write('A');
            char[] chs = {'我', '爱', 'P', 'y', 't', 'h', 'o', 'n', '\r', '\n'};
            fw.write(chs);
            fw.write("明天休息不上课\r\n");
            fw.write("非常nice！");

            //fw.flush();

            //关闭流功能会自动调用刷新功能
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
