package com.Tuling.demo.OOP;

/**
 * ClassName: TestBlock
 * Author: Roohom
 * Function:构造块和静态语句块的使用
 * Date: 2020/7/20 15:55
 * Software: IntelliJ IDEA
 */
public class TestBlock {
    //2
    {
        System.out.println("构造块");
    }

    //3
    public TestBlock(){
        System.out.println("构造方法体");
    }

    //1
    static {
        System.out.println("静态语句块");
    }

    public static void main(String[] args) {

        //当类加载时，首先先加载静态块(static块)中的内容
        TestBlock tb = new TestBlock();
    }

}
