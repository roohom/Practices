package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw10
 * Author: Roohom
 * Function:
 * 定义一个长度为20的数组，元素为20-40的随机数
 * 打印输出指定元素在数组中出现的次数（指定元素为键盘录入范围为20-40之间）
 *
 * Date: 2020/7/16 20:27
 * Software: IntelliJ IDEA
 */
public class hw10 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("请输入一个在20-40之间的随机数:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            int num = (int)(Math.random()*21+20);
            arr[i] = num;
            //System.out.print(num+" ");
            if(input==num){
                count++;
            }
        }
        System.out.println("您输入的数字在这个数组中共出现了"+count+"次");
    }
}
