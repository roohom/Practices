package com.Tuling.demo.OOP;

/**
 * ClassName: TestSubObject
 * Author: Roohom
 * Function:
 * Date: 2020/7/20 16:47
 * Software: IntelliJ IDEA
 */
public class TestSubObject extends TestSuperObject{

    //构造块
    {
        System.out.println("TestSubObject类中的构造块");
    }

    public TestSubObject(){
        System.out.println("TestSubObject()的方法体");
    }

    static {
        System.out.println("TestSubObject类中的静态语句块");
    }


    public static void main(String[] args) {
        TestSubObject ts = new TestSubObject();
    }
}


