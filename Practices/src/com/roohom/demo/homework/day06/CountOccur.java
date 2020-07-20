package com.roohom.demo.homework.day06;

/**
 * ClassName: CountOccur
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 19:33
 * Software: IntelliJ IDEA
 */
public class CountOccur {
    public static int countOccurTimes(int[] arr) {
        int count = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < newArr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            newArr[i] = count;
        }
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i]==1){
                sum += newArr[i];
            }
        }
        return sum;
    }

    /**
     * Function 统计数组中元素出现次数为1的元素个数
     * @param arr 传入数组
     * @return  出现次数为1的元素个数
     */
    public static int NumOnceAndCount(int[] arr) {
        //依次对每个位置上的数进行扫描，扫描的同时将此数与其他位置的数对比，如果相同，不做统计，如果不同，则计数
        // 双层循环
        int sum = 0;
        int[] tempArr =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            tempArr[i] = count;
        }
        for (int k=0;k<tempArr.length;k++)
        {
            if (tempArr[k]==1)
            {
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        System.out.println("数组只出现一次的元素有"+NumOnceAndCount(arr)+"个");
    }


}
