package com.roohom.demo.ClassDemo.OOP.classDemo;

/**
 * ClassName: Phone
 * Author: Roohom
 * Function:手机类
 * Date: 2020/7/19 08:24
 * Software: IntelliJ IDEA
 */
public class Phone {
        String brand;
        int price;
        String color;
    public static void call(String name){
        System.out.println("给"+name+"打电话"+"......");
    }
    public void sendMessage(String name)
    {
        System.out.println("给"+name+"发消息"+"......");
    }

}


