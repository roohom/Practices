package com.Tuling.demo.Pratices;

import java.util.Arrays;

/**
 * ClassName: ArrayArr
 * Author: Roohom
 * Function:二维数组
 * Date: 2020/7/17 14:36
 * Software: IntelliJ IDEA
 */
public class ArrayArr {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        //二维数组的初始化
        int[][] arr2 = {{1,2,3,5},{2,4,6},{8,9,10,15}};

        //如何遍历二维数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("第一个数组有"+(i+1)+"个元素:"+arr2[i].length);
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
                //System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }
    }
}
