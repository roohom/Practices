package com.Tuling.demo;

/**
 * ClassName: TestArray
 * Author: Roohom
 * Function:
 * Date: 2020/7/14 22:52
 * Software: IntelliJ IDEA
 */
public class TestArray {
    public static void main(String[] args) {
        //数组的创建和赋值
        //创建的同时并赋初始值
        int[] arr1={10,20,30,40,50};

        //
        int[] arr2 = new int[]{10,20,30,40,50};
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
