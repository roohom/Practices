package com.roohom.demo.homework.day04;

/**
 * ClassName: hw05
 * Author: Roohom
 * Function:
 * 需求：求出数组中索引与索引对应的元素都是奇数的元素
 * ​	1、遍历数组
 * ​	2、判断索引是否是奇数（索引 % 2 != 0）
 * ​	3、判断索引对应的元素是否是奇数(arr[索引] % 2 != 0)
 * ​	4、满足条件输出结果
 *
 * Date: 2020/7/16 19:20
 * Software: IntelliJ IDEA
 */
public class hw05 {
    public static void main(String[] args) {
        //用于测试的整数数组
        int[] num = {1,3,5,8,10,12,11,11};
        for (int i=0;i<num.length;i++)
        {
            if (i%2 !=0 && num[i]%2 !=0)
            {
                System.out.print(num[i]+" ");
            }
        }
    }
}
