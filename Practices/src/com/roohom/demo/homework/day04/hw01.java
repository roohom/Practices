package com.roohom.demo.homework.day04;

/**
 * ClassName: hw01
 * Author: Roohom
 * Function:遍历1~100(包含1和100)之间的数字，求出能同时被3，5整除的数的和，并将求出的和打印到控制台上
 * Date: 2020/7/16 19:05
 * Software: IntelliJ IDEA
 */
public class hw01 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}
