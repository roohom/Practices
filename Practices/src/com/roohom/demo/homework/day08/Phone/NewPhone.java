package com.roohom.demo.homework.day08.Phone;

/**
 * ClassName: NewPhone
 * Author: Roohom
 * Function:新手机类
 * Date: 2020/7/22 19:23
 * Software: IntelliJ IDEA
 */
public class NewPhone extends Phone implements IPlay{
    public NewPhone() {
    }

    @Override
    public void call() {
        System.out.println("新手机打电话...");
    }

    @Override
    public void sendMesage() {
        System.out.println("新手机发短信...");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏...");
    }
}
