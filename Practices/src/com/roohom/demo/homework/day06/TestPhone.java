package com.roohom.demo.homework.day06;

/**
 * ClassName: TestPhone
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 19:54
 * Software: IntelliJ IDEA
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setBrand("小米");
        phone.setPrice(3998);
        phone.setColor("黑色");
        phone.call();
        phone.sendMessage();
    }
}
