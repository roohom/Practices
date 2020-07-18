package com.roohom.demo.homework.day05;

/**
 * ClassName: hw04
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 19:23
 * Software: IntelliJ IDEA
 */
public class hw04 {

    public static void getNumInFiveHun()
    {
        int count = 0;
        for (int i=1;i<500;i++)
        {
            if (i%2==0 && i%5==0 && i%7==0)
            {
                System.out.print(i+" ");
                count++;
                if (count%5==0)
                {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("1-500之内能同时被2、、5、7整除的数的个数是:"+count);
    }

    public static int getSumByThreeAndFive()
    {
        int sum=0;
        for (int j=0;j<100;j++)
        {
            if (j%3==0 | j%5==0)
            {
                sum += j;
                //System.out.println(j); 用于测试是了哪些数
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        getNumInFiveHun();
        System.out.println("100以内能被3整数的数加上能被5整除的数的和是:"+getSumByThreeAndFive());
    }
}
