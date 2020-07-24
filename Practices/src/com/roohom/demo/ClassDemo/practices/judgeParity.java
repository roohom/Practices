package com.roohom.demo.ClassDemo.practices;

import java.util.Scanner;

/**
 * ClassName: com.roohom.demo.ClassDemo.practices.judgeParity
 * Author: Roohom
 * File: com.roohom.demo.ClassDemo.practices.judgeParity
 * Date: 2020/7/12 21:48
 * Software: IntelliJ IDEA
 */
public class judgeParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        if(num % 2==0)
        {
            System.out.println(num+"是一个偶数！");
        }
        else
            {
                System.out.println(num+"是一个奇数！");
            }
    }
}
