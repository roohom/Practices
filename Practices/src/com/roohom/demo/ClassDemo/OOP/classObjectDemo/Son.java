package com.roohom.demo.ClassDemo.OOP.classObjectDemo;

/**
 * ClassName: son
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 16:09
 * Software: IntelliJ IDEA
 */
//子类只能继承一个父类
public class Son extends Father{
    int age=10;

    public int superAge()
    {
        return super.age;
    }
}
