package com.roohom.demo.homework.day05;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: hw05
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 19:33
 * Software: IntelliJ IDEA
 */

//未完成！

public class hw05 {
    //将奇数放在数组的左侧,偶数放在数组的右侧
    //从头向尾部扫描，如果扫描到奇数，不做操作，如果是偶数，把它赋值给temp保存，后面所有的数
    //向前移动一位，待移动完，把temp放置在末尾
    public static void OddLeftEvenRight(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp = arr[i];

                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int NumOnceAndCount(int[] arr) {
        //依次对每个位置上的数进行扫描，扫描的同时将此数与其他位置的数对比，如果相同，不做统计，如果不同，则计数
        // 双层循环
        int count = 0;
        int[] temp = new int[10];
        for (int i=0;i<arr.length;i++)
        {
            temp[i] = arr[i];
            count++;
            if (Arrays.asList(temp).contains(arr[i]))
            {
                Arrays.asList(temp).remove(arr[i]);

            }
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(count);
        return count;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] != arr[j]) {
//                    System.out.print(arr[i] + " ");
//                    count++;
//                    break;
//                }
//            }
//        }
    }

    public static void main(String[] args) {

        //键盘录入10个整数存入数组
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        //打印原数组
        System.out.print("原   数  组:");
        printArray(arr);
//        OddLeftEvenRight(arr);
//        System.out.println();
//        //打印处理后的数组
//        System.out.print("处理后的数组:");
//        printArray(arr);
        System.out.println();
        NumOnceAndCount(arr);
    }
}
