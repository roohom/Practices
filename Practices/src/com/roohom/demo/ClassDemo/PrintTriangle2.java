package com.roohom.demo.ClassDemo;

/**
 * ClassName: PrintTriangle2
 * Author: Roohom
 * Function: 打印一个正三角形
 * Date: 2020/7/15 17:35
 * Software: IntelliJ IDEA
 */
public class PrintTriangle2 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
