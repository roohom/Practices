package com.roohom.demo.ClassDemo.OOP.classDemo;

/**
 * ClassName: PersonTest
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 15:51
 * Software: IntelliJ IDEA
 */
public class PersonTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("老师");
        t.teach();

        Student stu = new Student();
        stu.setName("学生");
        stu.study();
    }
}
