package com.roohom.demo;

import java.util.Scanner;

/**
 * ClassName: minAndSum
 * Author: Roohom
 * Function:
 * Date: 2020/7/13 19:26
 * Software: IntelliJ IDEA
 */
//	1.键盘录入三个int类型的数字
//            2.要求：
//            (1)求出三个数中的最小值并打印
//            (2)求出三个数的和并打印

public class minAndSum {
    public static void main(String[] args) {
        //键盘录入三个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a = sc.nextInt();
        System.out.println("请输入b的值:");
        int b = sc.nextInt();
        System.out.println("请输入c的值:");
        int c = sc.nextInt();

        //判断三个数中的最小值
        int temp = (a<b)?a:b;
        int min = (temp<c)?temp:c;
        System.out.println("这三个数中的最小值是:"+min);

        //求和
        int sum = a+b+c;
        System.out.println("这三个数的和是:"+sum);
    }
}
