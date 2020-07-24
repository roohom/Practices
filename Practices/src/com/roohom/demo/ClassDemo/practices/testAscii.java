package com.roohom.demo.ClassDemo.practices;

/**
 * ClassName: com.roohom.demo.ClassDemo.practices.testAscii
 * Author: Roohom
 * File: com.roohom.demo.ClassDemo.practices.testAscii
 * Date: 2020/7/13 10:49
 * Software: IntelliJ IDEA
 */


public class testAscii {
    public static void main(String[] args) {
        char ch = 'a';
        int n = 1;

        // 内部有char -> int的隐式类型转换
        char result =(char ) (ch + n);

        System.out.println(result);
    }
}
