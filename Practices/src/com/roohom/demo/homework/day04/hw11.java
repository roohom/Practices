package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw11
 * Author: Roohom
 * Function:
 * 1.  使用循环的方式键盘录入6个整数，（录入的时候要求先提示”请输入第几个数：”）并将这6个数存储到数组中
 * 2.  计算去掉数组中最小的值和最大的值之后的剩余元素平均值；
 * 3.  将求出的平均值打印到控制台上；
 * <p>
 * Date: 2020/7/16 20:35
 * Software: IntelliJ IDEA
 */
public class hw11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        float sum = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第" + i + "个数:");
            int num = sc.nextInt();
            arr[i - 1] = num;
            sum += num;
        }
        int max = arr[0], min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        sum = sum - max - min;
        float avg = (float) (sum / 4);
        System.out.println("去除最大值和最小值之后的其余元素的平均值是:" + avg);
    }
}
