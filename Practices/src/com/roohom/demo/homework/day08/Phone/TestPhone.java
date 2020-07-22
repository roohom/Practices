package com.roohom.demo.homework.day08.Phone;

/**
 * ClassName: TestPhone
 * Author: Roohom
 * Function:测试类
 * Date: 2020/7/22 19:25
 * Software: IntelliJ IDEA
 */
public class TestPhone {

    //既能接收老手机对象也能接收新手机对象  -> 多态
    public static void usePhone(Phone p)
    {
        p.call();
        p.sendMesage();
        if (p instanceof NewPhone)
            ((NewPhone) p).playGame();
    }

    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        NewPhone np = new NewPhone();
        usePhone(op);
        usePhone(np);
    }
}
