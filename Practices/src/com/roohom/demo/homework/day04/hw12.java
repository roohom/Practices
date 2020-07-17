package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw12
 * Author: Roohom
 * Function:打印等腰三角形
 *     *        4
 *    ***       3
 *   *****      2
 *  *******     1
 * *********    0
 *
 * Date: 2020/7/16 20:44
 * Software: IntelliJ IDEA
 */
public class hw12 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=(i*2-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("打印等腰三角形，超级加倍增强版，全体起立！");
        System.out.print("你想打印几层?请输入你想打印的层数:");
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        for (int i=1;i<=floor;i++)
        {
            for (int j=floor-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=(i*2-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
