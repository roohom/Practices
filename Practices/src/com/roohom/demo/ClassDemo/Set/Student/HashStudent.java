package com.roohom.demo.ClassDemo.Set.Student;

import com.roohom.demo.homework.day10.Student.Student;

import java.util.HashSet;

/**
 * ClassName: HashStudent
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 15:08
 * Software: IntelliJ IDEA
 */
public class HashStudent {
    public static void main(String[] args) {
        HashSet<Student> stuset = new HashSet<Student>();
        stuset.add(new Student("白菜",23));
        stuset.add(new Student("白菜",23));
        Student stu1 = new Student("白菜",23);
        Student stu2 = new Student("白菜",23);
        stuset.add(stu1);
        stuset.add(stu2);

        for (Student student : stuset) {
            System.out.println(student);
        }


    }
}
