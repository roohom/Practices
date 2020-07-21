package com.roohom.demo.homework.day07.LaptopInterface;

/**
 * ClassName: Laptop
 * Author: Roohom
 * Function:
 * Date: 2020/7/21 19:29
 * Software: IntelliJ IDEA
 */
public  class Laptop implements USB {
    public void open()
    {
        System.out.println("开机");
    }

    public void shutdown()
    {
        System.out.println("关机");
    }
    //使用USB设备的功能
    public void useUSB()
    {
        Mouse m = new Mouse();
        m.usb_open();
        m.usb_shutdown();
        Keyboard kb = new Keyboard();
        kb.usb_open();
        kb.usb_shutdown();
    }

    @Override
    public void usb_open() {
        System.out.print("连接");
    }

    @Override
    public void usb_shutdown() {
        System.out.print("断开");
    }
}
