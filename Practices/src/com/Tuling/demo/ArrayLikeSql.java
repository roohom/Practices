package com.Tuling.demo;

import java.util.Arrays;

/**
 * ClassName: ArrayLike
 * Author: Roohom
 * Function:数组的增删改查
 * Date: 2020/7/17 11:43
 * Software: IntelliJ IDEA
 */
public class ArrayLikeSql {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //向数组下标0-3的位置赋值10-40
        for (int i=0;i<4;i++)
        {
            arr[i] = (i+1)*10;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");

        //增
        //实现向数组中下标为0的位置插入元素50,原来的元素向后移动
        for (int k=arr.length-2;k>=0;k--)
        {
            arr[k+1] = arr[k];
            //System.out.println(arr[k]);
        }
        arr[0] = 50;
        System.out.println(Arrays.toString(arr));

        //删
        //将数组下标为0的元素删除，也就是让后续的元素向前移动,最后的位置为0
        System.out.println("----------------------");
        //删除第一个元素
        for (int m=0;m<arr.length-1;m++)
        {
            arr[m] = arr[m+1];
        }
        //最后的位置要清零
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");

        //查
        //查找数组中是否有元素是20，若存在则打印下标并将钙元素设置为300
        for (int n=0;n<arr.length;n++)
        {
            if (20==arr[n])
            {
                System.out.println("元素20所在的下标是:"+n);
                arr[n] = 300;
                //break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
