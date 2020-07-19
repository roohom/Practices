package com.roohom.demo.ClassDemo.OOP.ooptest;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:学生类
 * Date: 2020/7/19 08:20
 * Software: IntelliJ IDEA
 */
public class Student {
    private String name;
    private int age;

    //构造方法
    public Student(){
        System.out.println("无参构造方法");
    }

    //构造方法的重载
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public static void study(String name)
    {
        System.out.println(name+"在学习....");
    }


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

    public  static void eat(){
        System.out.println("在吃饭...");
    }
}
