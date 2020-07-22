package com.roohom.demo.homework.day08.ConcatStr;

import java.util.Scanner;

/**
 * ClassName: ConcatString
 * Author: Roohom
 * Function:将获取的5个字符拼接成新字符串，如果新字符串中有小写字符，将小写字符
 * 转换成大写字符，在控制台打印输出最终的新字符串
 * Date: 2020/7/22 20:21
 * Software: IntelliJ IDEA
 */
public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String cat = "";
        for (int i = 0; i < 5; i++) {
            int rdm = (int)(Math.random()*input.length());
            cat += input.charAt(rdm);
        }
        cat = cat.toUpperCase();
        System.out.println(cat);
    }
}
