package com.roohom.demo.homework.day09.SumArr;

/**
 * ClassName: SunArr
 * Author: Roohom
 * Function:计算字符串中的整数和
 * Date: 2020/7/24 19:09
 * Software: IntelliJ IDEA
 */
public class SumArr {
    /**
     * Function:将指定的字符串按照指定的字符分隔并装入字符串数组
     * @param str source array
     * @return  a string array
     */
    public static String[] String2Array(String str)
    {
        return str.split(",");
    }

    /**
     * Function:将字符串数组的每一位取出来转换成整数型
     * @param str source array
     * @return Integer array
     */
    public static int[] str2Int(String[] str)
    {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    /**
     * Function:将数组中的整数累加
     * @param arr source array
     * @return sum from the array
     */
    public static int getSumFromArray(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "11,22,33,44,55";
        System.out.println(getSumFromArray(str2Int(String2Array(str))));
    }
}
