package com.roohom.demo.ClassDemo;

/**
 * ClassName: forNumSum
 * Author: Roohom
 * Function:
 * Date: 2020/7/13 18:10
 * Software: IntelliJ IDEA
 */
public class forNumSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=100;i++)
        {
           sum += i ;
        }
        System.out.println("1-100之间所有的数的和是:"+sum);
    }
}
