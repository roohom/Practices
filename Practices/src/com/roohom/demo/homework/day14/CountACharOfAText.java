package com.roohom.demo.homework.day14;

import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.Scanner;

/**
 * ClassName: CountACharOfAText
 * Author: Roohom
 * Function:统计一篇文章中指定字符的个数
 * Date: 2020/7/31 19:42
 * Software: IntelliJ IDEA
 */
public class CountACharOfAText {

    //使用bufferedread()
    public static int buffReadCount() {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\IDEAJ\\Practices\\JavaSE_多线程.docx"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            System.out.println("请输入你想查找的指定字符串:");
            char ch = new Scanner(System.in).next().charAt(0);
            String str;
            //byte[] buffer = new byte[1024];
            while ((str=br.readLine())!=null)
            {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch)
                        count++;
                }

                /*int index = 0;
                while (str.length() >= input.length() && (index = str.indexOf(input)) >= 0) {
                    count++;
                    str = str.substring(index + input.length());
                }*/
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("统计到的该字符共有:"+count+"个！");
        return count;
    }

    //bufferedInputStream
    public static int buffInCount()
    {
        int count=0;
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
            System.out.println("请输入你想查找的指定字符:");
            char ch = new Scanner(System.in).next().charAt(0);
            int l = -1;
            byte[] buf = new byte[1024];
            while ((l = bis.read(buf)) != -1) {
                String str = new String(buf, 0, l);
                //System.out.println(str);
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch)
                        count++;
                }
            }
            //如果是大文章，推荐是读一行，统计一行
            //更简洁的方法
//             int count = str.split(ch).lengh-1;
//            if(str.toString().endsWith(ch))
//            {
//                count++;
//            }
            System.out.println("搜索到的该字符共有:" + count + "个");
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        buffReadCount();
        //buffInCount();
    }
}
