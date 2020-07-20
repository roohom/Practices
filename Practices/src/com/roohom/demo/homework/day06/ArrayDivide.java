package com.roohom.demo.homework.day06;

import java.util.Scanner;

/**
 * ClassName: ArrayDivide
 * Author: Roohom
 * Function:
 * 定义方法，参数为整数数组与指定元素，判断数组中有多少个能整除指定元素的，在主方法中输出。
 * ​数组int[] arr = {12,43,45,76,78,98,23,21,34,56};
 * 指定元素由键盘录入；
 * int[] arr = {12,43,45,76,78,98,23,21,34,56};
 * Date: 2020/7/19 21:03
 * Software: IntelliJ IDEA
 */
public class ArrayDivide {
    /**
     * Function 判断数组中有多少个能被传入的整数参数整除
     * @param arr 传入数组
     * @param num 传入整数
     * @return 目标结果，个数
     */
    public static int arrDivide(int[] arr,int num)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%num==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12,43,45,76,78,98,23,21,34,56};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数:");
        int num = sc.nextInt();
        System.out.println("该数组中有"+arrDivide(arr,num)+"个数能整除你输入的数。");
    }
}
