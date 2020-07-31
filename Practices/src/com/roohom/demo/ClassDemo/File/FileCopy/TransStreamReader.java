package com.roohom.demo.ClassDemo.File.FileCopy;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.*;

/**
 * ClassName: TransStreamReader
 * Author: Roohom
 * Function:文件复制
 * Date: 2020/7/31 11:38
 * Software: IntelliJ IDEA
 */
public class TransStreamReader {
    public static void main(String[] args) {
        //创建转换流对象
        try {
            //读取源文件的内容
            InputStreamReader isr = new InputStreamReader(new FileInputStream("file2.txt"),"utf-8");
            //向目的文件写内容
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file3.txt"),"utf-8");

            char[] cbuf = new char[1024];

            int len=-1;

            while ((len=isr.read(cbuf))!=-1)
            {
                osw.write(cbuf,0,len);
            }

            osw.flush();
            isr.close();
            osw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
