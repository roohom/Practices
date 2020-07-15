package com.roohom.demo;

/**
 * @ClassName: com.roohom.demo.characterType
 * @Author: Roohom
 * @File: com.roohom.demo.characterType
 * @Date: 2020/7/11 17:41
 * @Software: IntelliJ IDEA
 */



public class characterType {
    public static void main(String[] args){
        // 声明一个int类型变量 范围是21亿
        int ia = 2100000000;
        System.out.println(ia);

        // 声明一个byte类型变量 范围是-128~127
        byte b1 = 127;
        System.out.println(b1);

        // 声明一个short类型变量 范围是-32768~32767
        short s1 = 32767;
        System.out.println(s1);

        //声明一个long类型变量 比int类型要大， 后面跟上l或者L来区分；
        long l1 = 210000000000000L;
        System.out.println(l1);
        }
}
