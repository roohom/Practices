package com.roohom.demo.homework.day06;

import javax.crypto.spec.PSource;
import java.util.Arrays;

/**
 * ClassName: DividArr1ToArr2
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 21:11
 * Software: IntelliJ IDEA
 */
public class DividArr1ToArr2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        int count1=0;
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i] = (int)(Math.random()*9+1);
            if (arr1[i]%2==0)
                count1++;
        }
        arr2[0] = count1;
        int count2=0;
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j]%3==0)
                count2++;
        }
        arr2[1] = count2;

        System.out.println(Arrays.toString(arr2));
    }
}
