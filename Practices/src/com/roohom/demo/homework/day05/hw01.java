package com.roohom.demo.homework.day05;

/**
 * ClassName: hw01
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 18:59
 * Software: IntelliJ IDEA
 */
public class hw01 {

    public static double getSum(int a, double b)
    {
        return a+b;
    }

    public static boolean ifEqual(int a, double b)
    {
        return a==b;
    }

    public static double getMax(int a, double b)
    {
        return a>b ? a :b;
    }

    public static double getMin(int a, double b)
    {
        return a<b ? a:b;
    }

    public static void getMaxAndMin(int a, double b)
    {
        double max = a>b ? a:b;
        double min = a<b ? a:b;
        System.out.println("max="+max+","+"min="+min);
    }

    public static void main(String[] args) {
        System.out.println(getSum(10,11.1));
        System.out.println(ifEqual(10,11.1));
        System.out.println(getMax(10,11.1));
        System.out.println(getMin(10,11.1));
        getMaxAndMin(10,11.1);

    }
}
