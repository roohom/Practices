package com.roohom.demo.ClassDemo.OOP.classDemo;

/**
 * ClassName: PhoneTest
 * Author: Roohom
 * Function:手机的测试类
 * Date: 2020/7/19 08:29
 * Software: IntelliJ IDEA
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.brand = "大哥大";
        ph.price = 9999;
        ph.color = "黄色";

        System.out.println(ph.brand);
        System.out.println(ph.price);
        System.out.println(ph.color);

        ph.call("阿红");
        ph.sendMessage("阿红");

    }
}
