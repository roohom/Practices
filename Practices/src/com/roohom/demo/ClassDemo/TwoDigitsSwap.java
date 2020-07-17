package com.roohom.demo.ClassDemo;

/**
 * ClassName: TwoDigitsSwap
 * Author: Roohom
 * Function:
 * Date: 2020/7/15 09:37
 * Software: IntelliJ IDEA
 */
public class TwoDigitsSwap {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        a = a * b; //8
        b = a / b; //2
        a = a / b; //4
        System.out.println("a="+ a);
        System.out.println("b="+ b);

        int c = 2;
        int d = 4;
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
