package com.roohom.demo;

/**
 * ClassName: PrintMultiply02
 * Author: Roohom
 * Function:
 * Date: 2020/7/16 10:52
 * Software: IntelliJ IDEA
 */
public class PrintMultiply02 {
    public static void main(String[] args) {
        for (int i=9;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
