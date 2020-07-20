package com.roohom.demo.ClassDemo.OOP.TestThis;

import javax.swing.*;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 18:18
 * Software: IntelliJ IDEA
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为,成员方法
    public void study()
    {
        System.out.println("我是成员方法:学习,我被访问了");
    }

    public void eat()
    {
        System.out.println("我是成员方法:吃饭,我被访问了");
    }
}
