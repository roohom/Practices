package com.roohom.demo.homework.day05;

import java.util.Scanner;

/**
 * ClassName: hw02
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 19:09
 * Software: IntelliJ IDEA
 */
public class hw02 {
    public static int getLength(int length, int width)
    {
        return (length+width)*2;
    }

    public static int getArea(int length, int width)
    {
        return length*width;
    }

    public static double getCircleLength(int radius)
    {
        return 2*3.14*radius;
    }

    public static double getCircleArea(int radius)
    {
        return radius*radius*3.14;
    }

    public static void main(String[] args) {
        System.out.print("请输入长方形的长和宽:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("该长方形的周长是:"+getLength(length,width));
        System.out.println("该长方形的面积是:"+getArea(length, width));

        System.out.print("请输入圆的半径:");
        int radius = sc.nextInt();
        System.out.println("该圆的周长为:"+getCircleLength(radius));
        System.out.println("该圆的面积为:"+getCircleArea(radius));
    }
}
