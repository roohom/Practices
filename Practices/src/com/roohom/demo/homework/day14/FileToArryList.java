package com.roohom.demo.homework.day14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: FileToArryList
 * Author: Roohom
 * Function:读取文件中的内容并存入到ArrayList
 * Date: 2020/7/31 19:25
 * Software: IntelliJ IDEA
 */
public class FileToArryList {
    //另一种方法:
    public static void method()
    {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        ArrayList<String> lanList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data.txt");

            int l;
            StringBuilder str = new StringBuilder();
            while ((l = fis.read()) != -1) {
                str.append((char) l);
            }
            String[] strs = str.toString().split("\r\n");
            //System.out.println(Arrays.toString(strs));
            for (String s : strs) {
                lanList.add(s);
            }
            System.out.println("本年度最佳编程语言是:" + lanList.get((int) (Math.random() * strs.length)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
