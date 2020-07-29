package com.Tuling.demo.Pratices;

/**
 * ClassName: ArrayArr2
 * Author: Roohom
 * Function:二维数组
 * Date: 2020/7/17 14:53
 * Software: IntelliJ IDEA
 */
public class ArrayArr2 {
    public static void main(String[] args) {
        //声明一个二维数组来存储每个季度的数据
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("公司的年销售额是:"+sum);
    }
}
