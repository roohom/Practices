package com.roohom.demo;

/**
 * ClassName: PrintTriangle
 * Author: Roohom
 * Function:打印一个三角形
 * Date: 2020/7/15 17:31
 * Software: IntelliJ IDEA
 */
public class PrintTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
