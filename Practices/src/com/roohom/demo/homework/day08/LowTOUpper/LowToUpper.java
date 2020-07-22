package com.roohom.demo.homework.day08.LowTOUpper;

/**
 * ClassName: LowToUpper
 * Author: Roohom
 * Function:如果字符串是以数字开头或结尾，就将该字符串中包含的小
 * 写字符串转换成大写字符串，并在控制台打印输出
 * Date: 2020/7/22 20:34
 * Software: IntelliJ IDEA
 */
public class LowToUpper {
    public static void main(String[] args) {
        String[] str = {"12ab","java","45Cd","Server78"};
        for (int i = 0; i < str.length; i++) {
            if ((str[i].charAt(0)>=48)&&(str[i].charAt(0)<=57)||(str[i].charAt(str[i].length()-1))>=48&&(str[i].charAt(str[i].length()-1)<=57))
                str[i] = str[i].toUpperCase();
            System.out.println(str[i]);
        }
    }
}
