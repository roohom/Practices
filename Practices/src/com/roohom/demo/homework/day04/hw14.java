package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw14
 * Author: Roohom
 * Function:打印菱形
 *    *
 *   ***
 *  *****
 * *******
 *  *****
 *   ***
 *    *
 *
 * Date: 2020/7/16 21:35
 * Software: IntelliJ IDEA
 */
public class hw14 {
    public static void main(String[] args) {
        System.out.print("你想打印几层菱形?请输入你想打印的层数:");
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        for (int i=1;i<=floor;i++) {
            for (int j = floor - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k=floor-1;k>=1;k--)
        {
            for (int l=floor-1;l>=k;l--){
                System.out.print(" ");
            }
            for (int m=(k*2-1);m>=1;m--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
