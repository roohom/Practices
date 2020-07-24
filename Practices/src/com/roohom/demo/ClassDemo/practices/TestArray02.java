package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: TestArray02
 * Author: Roohom
 * Function:
 * Date: 2020/7/16 15:12
 * Software: IntelliJ IDEA
 */
public class TestArray02 {
    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3];
        int[] gen = new int[3];

        System.out.println(getType(arr1));
        System.out.println(gen);

    }
}
