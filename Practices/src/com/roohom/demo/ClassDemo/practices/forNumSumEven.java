package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: forNumSumEven
 * Author: Roohom
 * Function: 计算1-100之间的所有偶数的和
 * Date: 2020/7/13 18:14
 * Software: IntelliJ IDEA
 */

public class forNumSumEven {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=100;i+=2)
        {
            sum += i;
        }
        System.out.println("0-100之间所有的偶数的和是:"+sum);
    }
}
