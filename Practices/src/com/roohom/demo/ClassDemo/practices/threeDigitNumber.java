package com.roohom.demo.ClassDemo.practices;

import java.util.Scanner;

/**
 * ClassName: com.roohom.demo.ClassDemo.practices.threeDigitNumber
 * Author: Roohom
 * File: com.roohom.demo.ClassDemo.practices.threeDigitNumber
 * Date: 2020/7/12 21:33
 * Software: IntelliJ IDEA
 */
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int a = sc.nextInt();
        int l = a%10; //个位
        int m = a/10%10; //十位
        int h = a/100%10; //百位
        System.out.println("数字"+a+"的个位是"+l+",十位是"+m+",百位是"+h);

    }
}

