package com.roohom.demo.homework.day10.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: TestStudent
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 20:29
 * Software: IntelliJ IDEA
 */
public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("王大锤",98);
        Student stu2 = new Student("李大志",87);
        Student stu3 = new Student("张大壮",59);

        List<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);

        double sum = 0;
        for (int i = 0; i < stus.size(); i++) {
            sum += stus.get(i).getScore();
        }
        System.out.println("平均成绩是:"+sum/stus.size());
    }
}
