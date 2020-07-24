package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: GenerateRandomDigits
 * Author: Roohom
 * Function:随机生成五个随机整数(1~10之间)
 * Date: 2020/7/15 17:54
 * Software: IntelliJ IDEA
 */
public class GenerateRandomDigits {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            int num = (int)(Math.random()*10);
            System.out.println(num);
        }
    }
}
