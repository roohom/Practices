package com.roohom.demo.ClassDemo;

import java.util.Scanner;

/**
 * ClassName: SwitchPenetrate
 * Author: Roohom
 * Function:利用case穿透作用来使用switch case语句
 * Date: 2020/7/15 11:17
 * Software: IntelliJ IDEA
 */
public class SwitchPenetrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个季节:");
        int month = sc.nextInt();

        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你见过这样的日期吗？");
                break;

        }
    }
}
