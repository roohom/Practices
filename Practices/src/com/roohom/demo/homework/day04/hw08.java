package com.roohom.demo.homework.day04;

/**
 * ClassName: hw08
 * Author: Roohom
 * Function:
 * 定义一个长度为10的int型的数组arr，依次生成10个1-100（范围包括1和100）的随机数并存入arr中,
 * 然后将arr中的元素都往前移一个位置，最后一个元素的值是原来第一个元素的值，然后输出arr转换前和转换后的所有元素
 * Date: 2020/7/16 19:53
 * Software: IntelliJ IDEA
 */
public class hw08 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("转换前的元素顺序如下:");
        for (int i=0;i<arr.length;i++)
        {
            int num = (int)(Math.random()*100+1);
            arr[i] = num;
            System.out.print(num+" ");
        }
        int temp=arr[0];
        for (int j=0;j<arr.length-1;j++)
        {
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = temp;
        System.out.println("\n转换后的元素顺序如下:");
        for (int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
