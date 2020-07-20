package com.roohom.demo.homework.day06;

import java.util.Random;

/**
 * ClassName: PermutaePokes
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 21:20
 * Software: IntelliJ IDEA
 */
public class PermutaePokes {
    /**
     * Function 生成0~4之间的随机数，包括0和4
     * @return 一个0~4之间的随机数
     */
    public static int randomInt()
    {
        int num = (int)(Math.random()*5);
        return num;
    }

    /**
     * Function 数组二根据数组一的排列组合
     * 说明: 方块位有3,4,5,6,7共五种可能，其他位同
     * @param arr1 数组数组
     * @param arr2 字符串数组
     */
    public static void combine(int[] arr1,String[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    for (int l = 0; l < arr1.length; l++) {
                        System.out.println(arr2[0]+arr1[randomInt()]+arr2[1]+arr1[randomInt()]+arr2[2]+arr1[randomInt()]+arr2[3]+arr1[randomInt()]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,7};
        String[] arr2 = {"方块","梅花","红桃","黑桃"};
        combine(arr1,arr2);
    }
}
