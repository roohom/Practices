package com.roohom.demo;

import java.util.Scanner;

/**
 * ClassName: FunctionSwap
 * Author: Roohom
 * Function:利用函数的形式不适用第三个变量交换两个变量的值
 * Date: 2020/7/15 15:35
 * Software: IntelliJ IDEA
 */
public class FunctionSwap {
    static void swap(int a, int b)
    {
//        a = 2;
//        b = 4;
        a = a + b; //6
        b = a - b; //2
        a = a - b; //4
        System.out.println("你输入的第一个数和第二个数的值经过交换以后分别是:"+a+","+b);
    }

    public static void main(String[] args) {
        System.out.println("请输入你想交换的两个数：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1,num2);

    }
}
