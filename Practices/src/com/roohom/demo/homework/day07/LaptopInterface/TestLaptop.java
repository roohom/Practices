package com.roohom.demo.homework.day07.LaptopInterface;

/**
 * ClassName: TestLaptop
 * Author: Roohom
 * Function:测试类
 * Date: 2020/7/21 19:50
 * Software: IntelliJ IDEA
 */
public class TestLaptop {
    public static void main(String[] args) {
        Laptop lp = new Laptop() ;
        lp.open();
        lp.useUSB();
        lp.shutdown();
    }
}
