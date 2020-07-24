package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: ArrayReversionByDichotomy
 * Author: Roohom
 * Function:二分法使得数组反转
 * Date: 2020/7/16 18:12
 * Software: IntelliJ IDEA
 */

/*未完成！*/


public class ArrayReversionByDichotomy {

    //两个位置的元素交换
    public static void swap(int[] arr,int low, int high)
    {
        int temp;
        temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }


    public static void Dichotomy(int[] arr, int head, int tail) {
        //如果数组的长度为2,直接将两个值调换位置
        if (tail-head==1)
        {
            int temp;
            temp = arr[head];
            arr[head] = arr[tail];
            arr[tail] = temp;
        }
        //如果不是长度为2
        int mid = head/2;
        Dichotomy(arr,0,mid);
        mid=((head+1)+tail)/2;
        Dichotomy(arr,head+1,tail);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Dichotomy(arr,0,10);


        for (int i=10;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
