package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw13
 * Author: Roohom
 * Function:
 * 编码题：打印字母三角形
 * - 根据用户输入的数字，打印数字行数的等腰三角形
 *   - 例如：用户输入  4  ，则打印如下三角形
 *    A
 *   BBB
 *  CCCCC
 * DDDDDDD
 *
 * Date: 2020/7/16 20:56
 * Software: IntelliJ IDEA
 */
public class hw13 {
    public static void main(String[] args) {
        System.out.print("你想输入几层?随便输入:");
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        int ch = 65;
        for (int i=1;i<=floor;i++)
        {
            for (int j=floor-1;j>=i;j--)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=(i*2-1);j++)
            {
                System.out.print((char)(ch));
            }
            System.out.println();
            ch +=1;
        }
        System.out.println("全体起立！！！！！");
    }
}
