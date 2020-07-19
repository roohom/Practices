package com.roohom.demo.ClassDemo.OOP.ooptest;

/**
 * ClassName: StudentTest
 * Author: Roohom
 * Function:测试学生类
 * Date: 2020/7/19 08:22
 * Software: IntelliJ IDEA
 */
public class StudentTest {
    public static void main(String[] args) {

        //jvm执行此句则会自动调用构造方法
        Student stu = new Student();
        stu.setName("baicai");

        //使用构造方法来对内部私有参数进行赋值
        Student newStu = new Student("baicai",23);
        newStu.study(newStu.getName());

    }
}
