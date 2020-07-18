package com.roohom.demo.homework.day05;

/**
 * ClassName: hw03
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 19:20
 * Software: IntelliJ IDEA
 */
public class hw03 {
    public static void printAarray(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            if (i!=arr.length-1)
            {
                System.out.print(arr[i]+",");
            }
            else
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printAarray(arr);
    }
}
