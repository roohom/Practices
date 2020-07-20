package com.roohom.demo.homework.day06;

/**
 * ClassName: TestTeaAndStu
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:57
 * Software: IntelliJ IDEA
 */
public class TestTeaAndStu {
    public static void main(String[] args) {
        Student stu = new Student("小明",23);
        stu.eat();
        stu.study();

        Teacher tea = new Teacher("张老师",45);
        tea.eat();
        tea.teach();
    }
}
