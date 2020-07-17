package com.roohom.demo.homework.day03;

/**
 * ClassName: hw07
 * Author: Roohom
 * Function:报数游戏
 * Date: 2020/7/15 19:46
 * Software: IntelliJ IDEA
 */
public class hw07 {
    public static void main(String[] args) {
        for (int i=1;i<100;i++)
        {
            if (i%7==0 | i/10==7 | i%10==7)
            {
                System.out.println("黑马！");
                continue;
            }
            System.out.println(i);
        }
    }
}
