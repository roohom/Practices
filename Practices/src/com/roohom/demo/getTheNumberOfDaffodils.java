package com.roohom.demo;

import java.awt.event.WindowAdapter;
import java.util.Scanner;

/**
 * ClassName: getTheNumberOfDaffodils
 * Author: Roohom
 * Function:获取水仙花数
 * 1.	水仙花数是一个3位数的整数.
 * 2.	该数字的各个位数立方和相加等于它本身.
 * 3.	例如: 153就是水仙花数, 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
 * Date: 2020/7/13 18:20
 * Software: IntelliJ IDEA
 */
public class getTheNumberOfDaffodils {
    public static void main(String[] args) {
        System.out.print("请输入一个三位数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //获取该数的个十百位
        int a = num/100%10; //百位
        int b = num/10%10; //十位
        int c = num%10;  //个位

        //利用公式判断该数的每一位的立方和是不是等于该数
        if (a*a*a + b*b*b + c*c*c == num)
        {
            System.out.println("这是一个正经的水仙花数鸭！");
        }
        else
        {
            System.out.println("你输入的这是啥玩意儿，不是水仙花数啊！");
        }


        for(int i=100;i<=999;i++)
        {
            int m = i/100%10; //百位
            int n = i/10%10; //十位
            int p = i%10;  //个位

            //利用公式判断该数的每一位的立方和是不是等于该数
            if (m*m*m + n*n*n + p*p*p == i)
            {
                System.out.println(i+"是一个正经的水仙花数鸭！");
            }
//            else
//            {
//                System.out.println(i+"是啥玩意儿，不是水仙花数啊！");
//            }
        }
    }
}
