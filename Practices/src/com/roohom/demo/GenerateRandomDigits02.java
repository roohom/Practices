package com.roohom.demo;

/**
 * ClassName: GenerateRandomDigits02
 * Author: Roohom
 * Function:获取0~100之间的随机数，包括0和100
 * Date: 2020/7/16 11:19
 * Software: IntelliJ IDEA
 */
//
//举例：
// 0.000000321 乘以101之后几乎不变
// 0.0000321 转换为整数型->0
// 再例:
//    0.999999999999 乘以101
//    100.99999999 转换为整形 -> 100

public class GenerateRandomDigits02 {
    public static void main(String[] args) {

        for (int i=0;i<=100;i++)
        {
            int num = (int) (Math.random()*101);
            System.out.println(num);
        }
    }
}
