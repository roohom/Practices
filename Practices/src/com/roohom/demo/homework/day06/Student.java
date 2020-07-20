package com.roohom.demo.homework.day06;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:44
 * Software: IntelliJ IDEA
 */
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("在学习");
    }

    @Override
    public void eat() {
        System.out.println("学生吃冰棒、辣条");
    }
}
