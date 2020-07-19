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
    public static void oddLeftEvenRight(int[] arr) {
        int temp = 0;
        //int flag=0;
        // 测试:2 2 2 2 1 1 1 3 4 5
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                if (arr[i] % 2 == 0) {
                    temp = arr[i];
                    //idx = i;
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = temp;
                }
                //判断后面的位置是不是都是偶数，如果是就停止后面的操作，退出循环
                for (int k=i+1;k<arr.length;k++)
                {
                    if (arr[k]%2==0)
                    {
                        if ( arr[k]%2==0 && k==arr.length-1)
                            break;
                    }
                }
                i--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Function:打印数组中只出现一次的数字
     * @param arr 传入的数组
     */
    public static void NumOnceAndCount(int[] arr) {
        //依次对每个位置上的数进行扫描，扫描的同时将此数与其他位置的数对比，如果相同，不做统计，如果不同，则计数
        // 双层循环

        int[] tempArr =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            tempArr[i] = count;
        }
        System.out.print("出现一次的数字有:");
        for (int k=0;k<tempArr.length;k++)
        {
            if (tempArr[k]==1)
            {
                System.out.print(arr[k]+" ");
            }
        }
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
        oddLeftEvenRight(arr);
        System.out.println();
        //打印处理后的数组
        System.out.print("处理后的数组:");
        printArray(arr);
        System.out.println();
        NumOnceAndCount(arr);
    }
}
