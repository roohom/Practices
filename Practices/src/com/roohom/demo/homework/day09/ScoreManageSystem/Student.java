package com.roohom.demo.homework.day09.ScoreManageSystem;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:学生类
 * Date: 2020/7/24 19:17
 * Software: IntelliJ IDEA
 */
public class Student {
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void eat() {

    }

    public void study(String content) {

    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ']';
    }
}
