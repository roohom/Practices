package com.roohom.demo.homework.day06;

/**
 * ClassName: hw01
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 19:25
 * Software: IntelliJ IDEA
 */
public class hw21 {
    /**
     * Function 替换掉数组中元素为0的位置为100，并统计替换的次数
     * @param arr 传入数组
     * @return 次数
     */
    public static int replaceAndCount(int[] arr)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==0)
            {
                arr[i] = 100;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        System.out.println(replaceAndCount(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
