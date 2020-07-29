package com.Tuling.demo.Pratices;

/**
 * ClassName: printTriangle
 * Author: Roohom
 * Function:
 * Date: 2020/7/14 21:56
 * Software: IntelliJ IDEA
 */
public class printTriangle {
    public static void main(String[] args) {
        for (int i=1;i<5;i++)
        {
            for (int j=5;i<=j;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
