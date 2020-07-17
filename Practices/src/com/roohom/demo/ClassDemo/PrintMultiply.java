package com.roohom.demo.ClassDemo;

/**
 * ClassName: PrintMultiply
 * Author: Roohom
 * Function:打印99乘法口诀表
 * Date: 2020/7/15 17:47
 * Software: IntelliJ IDEA
 */
public class PrintMultiply {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
