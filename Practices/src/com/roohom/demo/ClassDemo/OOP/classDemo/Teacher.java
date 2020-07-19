package com.roohom.demo.ClassDemo.OOP.classDemo;

/**
 * ClassName: Teacher
 * Author: Roohom
 * Function:定义一个老师类
 * Date: 2020/7/19 15:48
 * Software: IntelliJ IDEA
 */
public class Teacher extends Person {
    //定义一个成员方法
    public void teach(){
        //getName是从Person类中继承来的
        System.out.println(getName()+"在讲课");

    }

}
