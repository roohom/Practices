package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw06
 * Author: Roohom
 * Function:
 * 分析以下需求，并用代码实现
 * 	1.键盘录入班级人数
 * 	2.根据录入的班级人数创建数组
 * 	3.利用随机数产生0~100的成绩(包含0和100)
 * 	4.要求:
 * 		(1)打印该班级的不及格人数
 * 		(2)打印该班级的平均分
 * 		(3)演示格式如下:
 * 			请输入班级人数:
 * 			键盘录入:100
 * 			控制台输出:
 * 				不及格人数:19
 * 				班级平均分:87
 *
 * Date: 2020/7/16 19:24
 * Software: IntelliJ IDEA
 */
public class hw06 {
    public static void main(String[] args) {
        System.out.print("请输入班级人数:");
        Scanner sc = new Scanner(System.in);
        int PersonNum = sc.nextInt();
        int[] arr = new int[PersonNum];

        float sum = 0;
        for (int i=0;i<arr.length;i++)
        {
            int num = (int)(Math.random()*101);
            arr[i]=num;
            sum += num;
            System.out.println(num);
        }
        int count=0;
        for (int j=0;j<arr.length;j++)
        {
            if (arr[j]<60)
            {
                count++;
            }
        }
        System.out.println("不及格人数:"+count);
        float avg = sum/PersonNum;
        System.out.println("班级平均分:"+avg);
    }
}
