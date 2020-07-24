package com.roohom.demo.ClassDemo.PackagingClass;

/**
 * ClassName: IntegerDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/24 16:25
 * Software: IntelliJ IDEA
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));


        System.out.println(i1.intValue()==i2.intValue());


    }
}
