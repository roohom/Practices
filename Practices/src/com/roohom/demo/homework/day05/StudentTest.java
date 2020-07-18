package com.roohom.demo.homework.day05;

/**
 * ClassName: StudentTest
 * Author: Roohom
 * Function:
 * Date: 2020/7/18 20:32
 * Software: IntelliJ IDEA
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三丰";
        stu.gender = "男";
        stu.age = 217;
        stu.id = 10;
        stu.score = 99.0;
        System.out.println(stu.say(stu.name));
        System.out.println(stu.say(stu.gender));

    }
}
