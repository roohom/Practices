package com.roohom.demo.ClassDemo.practices;

import java.util.Scanner;

/**
 * ClassName: ifScore
 * Author: Roohom
 * Function:
 * Date: 2020/7/13 19:19
 * Software: IntelliJ IDEA
 */


//	1.键盘录入一个学生成绩(int类型)
//            2.判断该学生成绩是否及格
//            3.打印格式：
//            成绩>=60:打印"合格"
//            成绩<60:打印"不合格"

public class ifScore {
    public static void main(String[] args) {
        System.out.println("情输入学生的成绩，将会判断其是否合格:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score<=100 & score >=0)
        {
            if (score >= 60) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
        }
        else
        {
            System.out.println("成绩超过了范围哟！");
        }
    }
}














