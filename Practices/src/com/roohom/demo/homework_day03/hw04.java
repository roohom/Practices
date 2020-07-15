package com.roohom.demo.homework_day03;

/**
 * ClassName: hw04
 * Author: Roohom
 * Function:输出100以内被6整除的数字
 * Date: 2020/7/15 19:23
 * Software: IntelliJ IDEA
 */
public class hw04 {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++)
        {
            if (i%6==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
