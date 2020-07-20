package com.Tuling.demo.OOP;

/**
 * ClassName: TestSuperObject
 * Author: Roohom
 * Function:
 * Date: 2020/7/20 16:41
 * Software: IntelliJ IDEA
 */
public class TestSuperObject {
    {
        System.out.println("TestSuperObject类中的构造块");
    }

    public TestSuperObject(){
        System.out.println("TestSuperObject()的方法体");
    }
    static {
        System.out.println("TestSuperObject类中的静态语句块");
    }

    public static void main(String[] args) {
        TestSuperObject ts = new TestSuperObject();
    }
}
