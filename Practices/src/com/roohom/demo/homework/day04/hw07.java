package com.roohom.demo.homework.day04;

/**
 * ClassName: hw07
 * Author: Roohom
 * Function:
 * 定义一个长度为5的int型数组，之后生成5个随机数存入数组，随机数范围为10到100（包含10和100），
 * 遍历数组，将数组中大于70的元素替换成5，之后打印修改后的数组并且打印修改数组的次数。
 *
 * Date: 2020/7/16 19:35
 * Software: IntelliJ IDEA
 */
public class hw07 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i=0;i<arr.length;i++)
        {
            int num = (int)(Math.random()*91+10);
                            //生成的是[0~1)
            arr[i] = num;
        }
        int count=0;
        for (int j=0;j<arr.length;j++)
        {
            if (arr[j]>70)
            {
                arr[j]=5;
                count++;
            }
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.println("修改了"+count+"次");
    }
}
