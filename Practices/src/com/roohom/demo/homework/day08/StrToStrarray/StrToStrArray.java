package com.roohom.demo.homework.day08.StrToStrarray;

import java.util.Arrays;

/**
 * ClassName: StrToStrArray
 * Author: Roohom
 * Function:把字符串转换成字符数组
 * Date: 2020/7/22 20:57
 * Software: IntelliJ IDEA
 */
public class StrToStrArray {

    public static char[] StrToArray(String str)
    {
        return str.toCharArray();
    }

    public static void main(String[] args) {
        String str = "roohom";
        //查看原类型
        System.out.println(str.getClass());
//        for (int i = 0; i < StrToArray(str).length ; i++) {
//            System.out.println(StrToArray(str)[i]);
//        }
        //查看转换后的类型
        System.out.println(StrToArray(str).getClass().toString());
        System.out.println(Arrays.toString(StrToArray(str)));
    }
}
