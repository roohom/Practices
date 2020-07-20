package com.roohom.demo.ClassDemo.OOP.TestPrivate;

/**
 * ClassName: StudentTest
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 18:14
 * Software: IntelliJ IDEA
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三丰";
        stu.setAge(117);
        //调用成员方法
        stu.show();
    }
}
