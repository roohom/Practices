package com.roohom.demo.homework.day11.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * ClassName: ListStudent
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 19:35
 * Software: IntelliJ IDEA
 */
public class ListStudent {
    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();

        System.out.println("请输入第1个学生的姓名和年龄:");
        Student stu1 = new Student(new Scanner(System.in).next(),new Scanner(System.in).nextInt());
        System.out.println("请输入第2个学生的姓名和年龄:");
        Student stu2 = new Student(new Scanner(System.in).next(),new Scanner(System.in).nextInt());
        System.out.println("请输入第3个学生的姓名和年龄:");
        Student stu3 = new Student(new Scanner(System.in).next(),new Scanner(System.in).nextInt());

        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        //ListIterator<Student> lit = stus.listIterator();
        for (Student stu : stus) {
            System.out.println(stu);
        }
    }
}
