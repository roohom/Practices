package com.roohom.demo;

/**
 * ClassName: com.roohom.demo.selfIncrease
 * Author: Roohom
 * File: com.roohom.demo.selfIncrease
 * Date: 2020/7/13 11:43
 * Software: IntelliJ IDEA
 */

public class selfIncrease {
    public static void main(String[] args) {
        int num1=10,num2=10,a,b;
        a = ++num1;
        b = num2++;
        System.out.println(a); //11
        System.out.println(b); //10
    }
}
