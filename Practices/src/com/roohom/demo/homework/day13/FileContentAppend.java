package com.roohom.demo.homework.day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileContentAppend
 * Author: Roohom
 * Function:在原文件中追加内容
 * Date: 2020/7/30 19:26
 * Software: IntelliJ IDEA
 */
public class FileContentAppend {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try{
            fos = new FileOutputStream("hello.txt",true);
            for (int i = 0; i < 5; i++) {
                fos.write("黑马程序员\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
