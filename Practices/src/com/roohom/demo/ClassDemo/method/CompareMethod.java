package com.roohom.demo.ClassDemo.method;

/**
 * ClassName: CompareMethod
 * Author: Roohom
 * Function:方法的重载示例
 * Date: 2020/7/18 17:40
 * Software: IntelliJ IDEA
 */
public class CompareMethod {
    public static void main(String[] args) {
        byte a=10,b=20;
        short c=10,d=20;
        int e=10,f=10;
        long g=10,h=20;
        System.out.println(compare(a,b));
        System.out.println(compare(c,d));
        System.out.println(compare(e,f));
        System.out.println(compare(g,h));

    }

    public static boolean compare(byte a, byte b)
    {
        System.out.println("Byte");
        return a==b;
    }
    public static boolean compare(short a, short b)
    {
        System.out.println("Short");
        return a==b;
    }
    public static boolean compare(int a, int b)
    {
        System.out.println("Int");
        return a==b;
    }
    public static boolean compare(long a, long b)
    {
        System.out.println("Long");
        return a==b;
    }

}
