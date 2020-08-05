package com.roohom.demo.ClassDemo.Reflection.Constructor;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 10:03
 * Software: IntelliJ IDEA
 */
public class Student {
    String name;
    int age;

    public Student() {
    }

    private Student(String name) {
        this.name = name;
        System.out.println("这是private构造方法方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println(this.name + "在学习中...");
    }

    private void seeAMoivie() {
        System.out.println("看电影");
    }

    public boolean ifEven(int num) {
        if (num % 2 == 0)
            return true;
        return false;
    }

    public boolean ifOddd(int num) {
        if (num % 2 != 0)
            return true;
        return false;
    }


}
