package com.roohom.demo.ClassDemo;

import java.util.Scanner;

/**
 * ClassName: com.roohom.demo.ClassDemo.testScannerDemo
 * Author: Roohom
 * File: com.roohom.demo.ClassDemo.testScannerDemo
 * Date: 2020/7/12 21:28
 * Software: IntelliJ IDEA
 */


public class testScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高:");
        int h1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高:");
        int h2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高:");
        int h3 = sc.nextInt();

        int temp = h1 < h2 ? h1:h2;
        int min =temp < h3 ? temp:h3;

        System.out.println("这三个和尚中身高最低的是:"+min+"cm");


    }
}
