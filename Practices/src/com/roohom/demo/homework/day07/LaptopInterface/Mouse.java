package com.roohom.demo.homework.day07.LaptopInterface;

/**
 * ClassName: Mouse
 * Author: Roohom
 * Function:鼠标类
 * Date: 2020/7/21 20:44
 * Software: IntelliJ IDEA
 */
public class Mouse implements USB{

    @Override
    public void usb_open() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void usb_shutdown() {
        System.out.println("断开鼠标的USB");
    }
}
