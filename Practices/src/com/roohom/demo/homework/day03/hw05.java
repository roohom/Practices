package com.roohom.demo.homework.day03;

/**
 * ClassName: hw05
 * Author: Roohom
 * Function:输出100以内被6整除的数字，每5个换一行
 * Date: 2020/7/15 19:26
 * Software: IntelliJ IDEA
 */
public class hw05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=0;i<=100;i++)
        {
            if (i%6==0) {
                System.out.print(i+" ");
                count++;
                if (count%5==0) {
                    System.out.println();
                }
            }
        }
    }
}
