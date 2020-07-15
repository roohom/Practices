package com.roohom.demo.homework_day03;

import java.util.Scanner;

/**
 * ClassName: hw03
 * Author: Roohom
 * Function:
 * Date: 2020/7/15 19:14
 * Software: IntelliJ IDEA
 */
public class hw03 {
    public static void main(String[] args) {
        System.out.println("请输入三个数，其中前两个数将用来进行计算，第三个数可代表以下运算:");
        System.out.println("0:表示加法运算");
        System.out.println("1:表示减法运算");
        System.out.println("2:表示乘法运算");
        System.out.println("3:表示除法运算");
        System.out.println("请输入:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        switch (c)
        {
            case 0:
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 1:
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 2:
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case 3:
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            default:
                System.out.println("啥也不是！");
        }
    }
}
