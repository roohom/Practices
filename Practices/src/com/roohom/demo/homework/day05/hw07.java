package com.roohom.demo.homework.day05;

import java.util.Arrays;

/**
 * ClassName: hw07
 * Author: Roohom
 * Function:
 *    	1. 创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数，
 *    	2. 定义一个方法，传入两个数组，函数中将两个数组不同的元素拼接成一个字符串，并打印该字符串
 *         如果没有则输出"对不起两个数组的所有元素均相同"
 * Date: 2020/7/18 20:54
 * Software: IntelliJ IDEA
 */
public class hw07 {
    /**
     * Function:判断随机数在数组中是否重复(已存在)
     *
     * @param arr 目标数组
     * @param num 判断的整数
     * @return 布尔值,true代表无重复，false代表有重复
     */
    public static boolean isRepatNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return false;
        }
        return true;
    }

    /**
     * Function:判断两个数组是不是完全相等
     *
     * @param arr1 传入数组
     * @param arr2 传入数组
     * @return 布尔值结果
     */
    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < 10; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //测试: 1 2 3 4 5 6 6 6 6 6
    //测试: 2 3 4 5 6 7 8 9 0 0
    //两个数组中不同的值:1 7 8 9 0 0
    //拼接后应该就是178900

    /**
     * function: 将两个数组中的元素进行拼接成字符串
     *
     * @param arr1 传入数组1
     * @param arr2 传入数组2
     * @return 字符串结果
     */
    public static String splice(int[] arr1, int[] arr2) {
        if (equals(arr1, arr2))
            System.out.println("对不起两个数组所有元素均相同！");
        //int[] newArr = new int[arr1.length+arr2.length];
        String str = "";
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = isRepatNum(arr2,arr1[i]);
            if (flag)
                str += arr1[i]+",";
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean flag = isRepatNum(arr2,arr1[i]);
            if (flag)
                str += arr2[i]+",";
        }
        return str;
    }

    /**
     * Function: 生成数字不重复的且在1~100之间的数组
     * @param arr 传入的空数组
     */
    public static void randomArray(int[] arr)
    {
        int index = 0;
        do {
            int rdm = (int) (Math.random() * 100 + 1);
            if (isRepatNum(arr, rdm)) {
                arr[index] = rdm;
                index++;
            }
        } while (index != arr.length);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        randomArray(arr1);
        randomArray(arr2);
//        int[] arr1 = {53, 73, 35, 75, 36, 4, 40, 57, 16, 21};
//        int[] arr2 = {11, 99, 56, 95, 49, 53, 76, 26, 4, 6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(splice(arr1, arr2));

    }
}
