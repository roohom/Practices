package com.roohom.demo.ClassDemo.Bubblsort;

import com.roohom.demo.ClassDemo.OOP.Polymorphism.ClassicCase.A;

import java.util.Arrays;

/**
 * ClassName: BubbleSort
 * Author: Roohom
 * Function:冒泡排序
 * Date: 2020/7/24 15:26
 * Software: IntelliJ IDEA
 */
public class BubbleSort {

    public static void swap(int[] arr,int i, int j)
    {
        int temp=0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int[] bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12,23,55,2,1,3,5,23,77,88};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
