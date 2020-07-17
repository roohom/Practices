package com.roohom.demo.homework.day04;

/**
 * ClassName: hw02
 * Author: Roohom
 * Function:求1~100以内(包含1和100)能被4整除但是不能被6整除的数的和，并将求出的和打印到控制台上
 * Date: 2020/7/16 19:07
 * Software: IntelliJ IDEA
 */
public class hw02 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++)
        {
            if (i%4==0 && i%6!=0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
