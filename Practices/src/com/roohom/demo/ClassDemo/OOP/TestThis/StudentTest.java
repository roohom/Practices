package com.roohom.demo.ClassDemo.OOP.TestThis;

/**
 * ClassName: StudentTest
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 18:21
 * Software: IntelliJ IDEA
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("张三丰");
        s.setAge(23);

        System.out.println(s.getName()+"..."+s.getAge());

        s.study();
        s.eat();
    }
}
