package com.roohom.demo.ClassDemo.File.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName: FileReaderDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/31 10:48
 * Software: IntelliJ IDEA
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("fileWriter.txt");
            char c = (char) fr.read();
            System.out.println(c);

            char c2 = (char) fr.read();
            System.out.println(c2);

            char[] cbuf = new char[1024];
            int len = fr.read(cbuf);
            for (int i = 0; i < len; i++) {
                System.out.print(cbuf[i]);
            }
            //System.out.print(Arrays.toString(cbuf));

            //String str = new String(cbuf,0,len);
            //System.out.println(str);
            //System.out.println(str.length());//1024 实际此str的长度和cbuf的数组同长度

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
