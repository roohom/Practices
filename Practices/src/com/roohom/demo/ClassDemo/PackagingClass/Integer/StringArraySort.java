package com.roohom.demo.ClassDemo.PackagingClass.Integer;

import com.roohom.demo.ClassDemo.OOP.Polymorphism.ClassicCase.A;

import java.util.Arrays;

/**
 * ClassName: StringArraySort
 * Author: Roohom
 * Function:字符串排序得到指定的输出
 * 1.	已知字符串String s = "91 27 45 38 50";
 * 2.	请通过代码实现最终输出结果是: "27, 38, 45, 50, 91"
 * Date: 2020/7/24 17:57
 * Software: IntelliJ IDEA
 */
public class StringArraySort {

    //将指定的字符串按照指定的字符分隔并装入字符串数组
    public static String[] String2Array(String str)
    {
        String[] strArr = str.split(" ");
        return strArr;
    }

    //将字符串数组的每一位取出来转换成整数型
    public static int[] str2Int(String[] str)
    {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    //将整数型数组转换成字符串
    public static String intArr2Str(int[] arr)
    {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1)
            {
                s.append(arr[i]).append(",");
            }
            else
                s.append(arr[i]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String s = "91 27 45 38 50";
        String[] strings = String2Array(s);
        int[] ints = str2Int(strings);
        Arrays.sort(ints);
        System.out.println(intArr2Str(ints));
//        System.out.println(Arrays.toString(ints));
    }
}
