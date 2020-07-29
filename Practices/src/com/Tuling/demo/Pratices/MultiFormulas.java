package com.Tuling.demo.Pratices;

/**
 * ClassName: MultiFormulas
 * Author: Roohom
 * Function: 使用循环打印99乘法表
 * Date: 2020/7/14 21:25
 * Software: IntelliJ IDEA
 */
public class MultiFormulas {
    public static void main(String[] args) {
        for (int i=1;i<10;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+"x"+j+"="+(j*i)+" ");
            }
            System.out.println();
        }
    }
}
