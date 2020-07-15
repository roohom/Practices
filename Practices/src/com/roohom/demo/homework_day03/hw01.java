package com.roohom.demo.homework_day03;

import java.util.Scanner;

/**
 * ClassName: hw01
 * Author: Roohom
 * Function:
 * Date: 2020/7/15 19:01
 * Software: IntelliJ IDEA
 */
public class hw01 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y;
        if(x<0)
        {
            y=-1;
            System.out.println("x="+x+",y="+y);
        }
        else if (x==0)
        {
            y=0;
            System.out.println("x="+x+",y="+y);
        }
        else if (x>0)
        {
            y=1;
            System.out.println("x="+x+",y="+y);
        }
    }
}
