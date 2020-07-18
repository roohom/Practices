package com.roohom.demo.homework.day05;

/**
 * ClassName: hw06
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 20:37
 * Software: IntelliJ IDEA
 */
public class hw06 {

    public static boolean equals(int[] arr1, int[] arr2)
    {
        if (arr1.length!=arr2.length)
            return false;
        for (int i=0;i<arr1.length;i++)
        {
            if (arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void fill(int[] arr, int value)
    {
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = value;
        }
    }

    public static void fill(int[] arr, int fromIndex, int toIndex, int value)
    {
        for (int i=fromIndex;i<toIndex;i++)
        {
            arr[i] = value;
        }
    }

    public static int[] copyOf(int[] arr, int newLength)
    {
        int[] newArr = new int[newLength];
        for (int i=0;i<newLength;i++)
        {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] copyOfRange(int[] arr, int from, int to)
    {
        int[] aNewArr = new int[to-from];
        for (int i=from;i<to;i++)
        {
            aNewArr[i] = arr[i];
        }
        return aNewArr;
    }


    public static void main(String[] args) {

    }
}
