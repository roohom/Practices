package com.roohom.demo.homework.day04;

/**
 * ClassName: hw04
 * Author: Roohom
 * Function:
 * 定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
 * ​	1.定义5个元素数组
 * ​	2.可以使用初始化数组的两种方式之一为数组元素赋值
 * ​	3.遍历数组求数组中的最小值
 *
 * Date: 2020/7/16 19:18
 * Software: IntelliJ IDEA
 */
public class hw04 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,10,8};
        int min=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
