package com.roohom.demo.ClassDemo; /**
 * ClassName: com.roohom.demo.ClassDemo.parityJudge
 * Author: Roohom
 * Function:
 * Date: 2020/7/13 17:11
 * Software: IntelliJ IDEA
 */

import java.util.Scanner;

public class parityJudge {
    public static void main(String[] args) {
        System.out.println("请输入一个数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0)
        {
            System.out.println("这是一个偶数！");
        }
        else
            {
                System.out.println("这是一个奇数！");
            }
    }
}
