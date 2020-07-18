package com.roohom.demo.homework.day05;

import org.omg.CORBA.MARSHAL;

import java.util.Arrays;

/**
 * ClassName: hw07
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 20:54
 * Software: IntelliJ IDEA
 */
public class hw07 {
    //判断两个数组是不是完全相等
    public static boolean equals(int[] arr1, int[] arr2)
    {
        if (arr1.length!=arr2.length)
            return false;
        for (int i=0;i<10;i++)
        {
            if (arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }

    //测试: 1 2 3 4 5 6 6 6 6 6
    //测试: 2 3 4 5 6 7 8 9 0 0
    //两个数组中不同的值:1 7 8 9 0 0
    //拼接后应该就是178900
    public static String splice(int[] arr1, int[] arr2)
    {
        if (equals(arr1,arr2))
            System.out.println("对不起两个数组所有元素均相同！");
        int[] newArr = new int[20];
        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                if (arr1[i]!=arr2[j] && j==arr2.length-1)
                {
                    newArr[i] = arr1[i];
                }
            }
        }
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr1.length;j++)
            {
                if (arr2[i]!=arr1[j] && j==arr1.length-1)
                {
                    newArr[10+i] = arr2[i];
                }
            }
        }
        String str=null;
        for (int k=0;k<20;k++)
        {
            //生成的是1~100的数，不可能有0，所以位置上是0的肯定是创建新数组时初始化默认的
            if (newArr[k]!=0)
            {
                str += newArr[k];
            }
        }

        return str;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i=0;i<10;i++)
        {
            arr1[i] = (int)(Math.random()*100);
        }
        for (int j=0;j<10;j++)
        {
            arr2[j] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(splice(arr1,arr2));

    }
}
