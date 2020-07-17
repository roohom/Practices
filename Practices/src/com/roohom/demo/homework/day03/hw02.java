package com.roohom.demo.homework.day03;

import java.util.Scanner;

/**
 * ClassName: hw02
 * Author: Roohom
 * Function:
 * Date: 2020/7/15 19:07
 * Software: IntelliJ IDEA
 */


public class hw02 {
    public static void main(String[] args) {
        int baseSalary = 3000;
        System.out.println("请键入您的工龄:");
        Scanner sc = new Scanner(System.in);
        int seniority = sc.nextInt();
        if (seniority>=0 & seniority<1)
        {
            System.out.println("您目前工作了"+seniority+"年，基本工资为 3000元, 应涨工资"+200+"元,涨后工资"+3200+"元");
        }
        else if(seniority>=1 & seniority<3)
        {
            System.out.println("您目前工作了"+seniority+"年，基本工资为 3000元, 应涨工资"+500+"元,涨后工资"+3500+"元");
        }
        else if(seniority>=3 & seniority<5)
        {
            System.out.println("您目前工作了"+seniority+"年，基本工资为 3000元, 应涨工资"+1000+"元,涨后工资"+4000+"元");
        }
        else if(seniority>=5 & seniority<10)
        {
            System.out.println("您目前工作了"+seniority+"年，基本工资为 3000元, 应涨工资"+2500+"元,涨后工资"+5500+"元");
        }
        else if(seniority>=10 & seniority<15)
        {
            System.out.println("您目前工作了"+seniority+"年，基本工资为 3000元, 应涨工资"+5000+"元,涨后工资"+8000+"元");
        }
    }
}
