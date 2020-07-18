package com.roohom.demo.ClassDemo.method;

/**
 * ClassName: MethodToPrintArray
 * Author: Roohom
 * Function:使用方法，来遍历数组
 * Date: 2020/7/18 17:55
 * Software: IntelliJ IDEA
 */
public class MethodToPrintArray {

    /**
     * function 打印数组
     * @param arr
     */
    public static void printArray(int[] arr)
    {
        System.out.print("[");
        for (int i=0;i<arr.length;i++)
        {
            if (i!=arr.length-1){
                System.out.print(arr[i]+",");
            }
            else {
                System.out.print(arr[i]+"]");
            }
        }
    }



    public static void main(String[] args) {
        int[] array = {11,2,3,4,5,6,3};
        printArray(array);
    }
}
