package com.roohom.demo.homework.day03;

import java.util.Scanner;

/**
 * ClassName: hw06
 * Author: Roohom
 * Function:打印输出录入的学生的成绩的平均值，输入-1表示结束
 * Date: 2020/7/15 19:32
 * Software: IntelliJ IDEA
 */
public class hw06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        float avg=0;
        int count=0;
        while (true)
        {
            int num = sc.nextInt();
            if(num==-1)
            {
                break;
            }
            count++;
            sum += num;
        }
        System.out.println("sum="+sum);
        System.out.println("count="+count);
        avg = (float)(sum)/ (float)(count);
        System.out.println("您所录入的学生的成绩的平均值是:"+avg);
    }
}
