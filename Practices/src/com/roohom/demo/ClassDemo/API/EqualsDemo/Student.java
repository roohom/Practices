package com.roohom.demo.ClassDemo.API.EqualsDemo;

import java.util.Objects;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 17:30
 * Software: IntelliJ IDEA
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if(this.age!= student.age) return false;
        return this.name != null ? this.name.equals(student.name) : student.name == null;
    }

}
