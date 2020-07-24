package com.roohom.demo.ClassDemo.PackagingClass;

/**
 * ClassName: Int2String
 * Author: Roohom
 * Function:
 * Date: 2020/7/24 16:29
 * Software: IntelliJ IDEA
 */
public class Int2String {
    public static void main(String[] args) {

        // int -> String
        int num1 = 100;
        String str = num1+"";
        System.out.println(str);

        String str2 = String.valueOf(num1);
        System.out.println(str2);

        //String -> int
        String s = "1000";
        Integer i1 = new Integer(s);
        System.out.println(s);

        int num = Integer.parseInt(s);
        System.out.println(s);

    }
}
