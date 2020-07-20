package com.roohom.demo.homework.day06;

import javax.print.DocFlavor;

/**
 * ClassName: Teacher
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:46
 * Software: IntelliJ IDEA
 */
public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("在上课");
    }

    @Override
    public void eat() {
        System.out.println("老师吃西北拉面、江西小炒、冰西瓜！");
    }
}
