package com.roohom.demo;

/**
 * ClassName: PrintRectangle
 * Author: Roohom
 * Function:打印一个矩形
 * Date: 2020/7/15 17:30
 * Software: IntelliJ IDEA
 */
public class PrintRectangle {
    public static void main(String[] args) {
        for (int i=1;i<5;i++)
        {
            System.out.println("* * * * *");
        }

        //另一种写法:
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i=1;i<5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
