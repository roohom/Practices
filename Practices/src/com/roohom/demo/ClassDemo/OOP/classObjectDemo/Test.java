package com.roohom.demo.ClassDemo.OOP.classObjectDemo;

import javax.crypto.spec.PSource;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 16:11
 * Software: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.GrandFatherSay();//允许访问父类的父类的方法
        System.out.println(son.superAge());
    }



}
