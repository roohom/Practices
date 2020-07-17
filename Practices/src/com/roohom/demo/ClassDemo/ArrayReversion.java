package com.roohom.demo.ClassDemo;

/**
 * ClassName: ArrayReversion
 * Author: Roohom
 * Function:数组反转，头尾替换
 * Date: 2020/7/16 17:09
 * Software: IntelliJ IDEA
 */
public class ArrayReversion {
    static void Reversion(int[] arr)
    {
        //获取数组的中轴，用来作为翻转的基础
        int CenterAxis=arr.length/2;
        for (int i = 0; i < CenterAxis; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    static void PrintArray(int[] arr)
    {
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("使用二分法反转之前:");
        PrintArray(arr);
        System.out.println();
        Reversion(arr);
        System.out.println("使用二分法反转之后:");
        PrintArray(arr);

    }
}
