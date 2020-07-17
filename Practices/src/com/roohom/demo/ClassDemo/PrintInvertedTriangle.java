package com.roohom.demo.ClassDemo;

/**
 * ClassName: PrintInvertedTriangle
 * Author: Roohom
 * Function:打印倒三角形
 * Date: 2020/7/15 17:43
 * Software: IntelliJ IDEA
 */
public class PrintInvertedTriangle {
    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
