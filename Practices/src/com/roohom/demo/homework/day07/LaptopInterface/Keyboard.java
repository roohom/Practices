package com.roohom.demo.homework.day07.LaptopInterface;

/**
 * ClassName: Keyboard
 * Author: Roohom
 * Function:键盘类
 * Date: 2020/7/21 20:44
 * Software: IntelliJ IDEA
 */
public class Keyboard implements USB{

    @Override
    public void usb_open() {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void usb_shutdown() {
        System.out.println("断开键盘的USB");
    }
}
