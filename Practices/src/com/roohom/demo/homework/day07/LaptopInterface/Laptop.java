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


    //使用USB设备的功能   应该传入参数，使用多态正确写法是下面的useUSB
    public void useUSB1()
    {
        //多态
        USB mouseUsb = new Mouse();
        mouseUsb.usb_open();
        mouseUsb.usb_shutdown();

        USB kyeboardUsb = new Keyboard();
        kyeboardUsb.usb_open();
        kyeboardUsb.usb_shutdown();

        //非多态
//        Mouse m = new Mouse();
//        m.usb_open();
//        m.usb_shutdown();
//        Keyboard kb = new Keyboard();
//        kb.usb_open();
//        kb.usb_shutdown();
    }

    //如果不至于键盘和鼠标，上面的代码将会越来越多
    //多态将上面的方法进行简写，将重复的代码抽取
    public void useUSB(USB usb)
    {
        usb.usb_open();
        usb.usb_shutdown();
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
