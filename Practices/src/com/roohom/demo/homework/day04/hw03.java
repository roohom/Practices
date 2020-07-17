package com.roohom.demo.homework.day04;

import java.util.Random;

/**
 * ClassName: hw03
 * Author: Roohom
 * Function:随机生成10个1~100之间的随机数（包括1和100），并将随机出来的10个数中是偶数的数字相加,把结果打印到控制台上
 * Date: 2020/7/16 19:09
 * Software: IntelliJ IDEA
 */
public class hw03 {
    public static void main(String[] args) {
        int[] num =new int[10];
        for (int i=0;i<10;i++)
        {
            int rdm = (int) (Math.random()*100+1);
            num[i]=rdm;
        }
        int sum=0;
        for (int j=0;j<10;j++)
        {
            if (num[j]%2==0)
            {
                sum+=num[j];
            }
        }
        System.out.println(sum);
    }
}
