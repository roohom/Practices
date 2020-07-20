package com.roohom.demo.homework.day06;

/**
 * ClassName: TestManagerAndCoder
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:25
 * Software: IntelliJ IDEA
 */
public class TestManagerAndCoder {
    public static void main(String[] args) {
        Manager mng = new Manager(123,15000,6000);
        mng.work();
        Coder cd = new Coder(135,10000);
        cd.work();
    }
}
