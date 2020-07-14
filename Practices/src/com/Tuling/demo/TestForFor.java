package com.Tuling.demo;

import java.util.Scanner;

/**
 * ClassName: TestForFor
 * Author: Roohom
 * Function:
 * Date: 2020/7/14 20:56
 * Software: IntelliJ IDEA
 */
public class TestForFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<=2;i++)
        {
            float avg=0;
            System.out.println("请输入第"+(i+1)+"个班级的成绩:");
            for (int j=1;j<=4;j++)
            {
                System.out.println("请输入第"+j+"个学生的成绩:");
                int score = sc.nextInt();
                avg += score;

            }
            avg /= 4;
            System.out.println("第"+(i+1)+"个班级的平均成绩是:"+avg);
        }
    }

}

