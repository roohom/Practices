package com.roohom.demo.homework.day08.Phone;

/**
 * ClassName: OldPhone
 * Author: Roohom
 * Function:旧手机类
 * Date: 2020/7/22 19:21
 * Software: IntelliJ IDEA
 */
public class OldPhone extends Phone{

    public OldPhone() {

    }

    @Override
    public void call() {
        System.out.println("旧手机打电话...");
    }

    @Override
    public void sendMesage() {
        System.out.println("旧手机发短信...");
    }
}
