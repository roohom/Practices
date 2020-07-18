package com.roohom.demo.ClassDemo;

/**
 * ClassName: ThinkForBinarySwap
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 14:46
 * Software: IntelliJ IDEA
 */
public class ThinkForBinarySwap {
    //用于相邻两个位置的数的交换
    static void swap(int start, int end, int arr[]){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    //想法开始
    static void BinarySwap(int start, int end, int arr[])
    {
        int mid = (start+end)/2;
        if ((end-start)>1)
        {
            start=start; end = mid;
            BinarySwap(start,end,arr);
            swap(start,end,arr);
        }
        if ((end-start)>1)
        {
            start=mid;end=end;
            BinarySwap(start,end,arr);
            swap(start,end,arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        BinarySwap(0,arr.length-1,arr);

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
