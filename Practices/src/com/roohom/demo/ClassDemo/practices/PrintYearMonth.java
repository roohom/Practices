package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: PrintYearMonth
 * Author: Roohom
 * Function:打印2020-2023年所有的月份
 * Date: 2020/7/15 17:27
 * Software: IntelliJ IDEA
 */
public class PrintYearMonth {
    public static void main(String[] args) {
        for (int i=2020;i<=2023;i++)
        {
            for(int j=1;j<=12;j++)
            {
                System.out.println(i+"年"+j+"月");
            }
        }
    }
}
