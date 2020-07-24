package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: PrintRhombus
 * Author: Roohom
 * Function:打印菱形
 * Date: 2020/7/16 08:30
 * Software: IntelliJ IDEA
 */
//     *
//    * *
//   *   *
//    * *
//     *
public class PrintRhombus {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++)
        {
            for (int j=2;j>=i;j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            // 1 0
            // 2 1
            // 3 3
            // 4 5
            // 从1开始的等差数列
            //从第二行开始
            for (int k=1;k<i+1;k+=2)
            {
                System.out.print(" ");
            }
            System.out.println("*");


        }
    }
}
