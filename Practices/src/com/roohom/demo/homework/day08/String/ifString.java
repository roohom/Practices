package com.roohom.demo.homework.day08.String;

import java.util.Scanner;

/**
 * ClassName: ifString
 * Author: Roohom
 * Function:截取出字符串中索引3-9位置上的字符（包含3和9），统计截取后新字符串中字母的总个数并输出到控制台上
 * Date: 2020/7/22 20:16
 * Software: IntelliJ IDEA
 */
public class ifString {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String cut = null;
        if (input.length() < 10)
            System.out.println("你输入的字符串不合法");
        else {
            cut = input.substring(3, 10);
            for (int i = 0; i < cut.length(); i++) {
                if (cut.charAt(i)>=97&&cut.charAt(i)<=122)
                    count++;
            }
            //System.out.println(cut);
            System.out.println(count);
        }
    }
}
