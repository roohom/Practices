package com.roohom.demo.ClassDemo.Collection.EnhancedFor;

import com.roohom.demo.homework.day09.ScoreManageSystem.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: EnhancedFor
 * Author: Roohom
 * Function:增强For
 * Date: 2020/7/25 17:27
 * Software: IntelliJ IDEA
 */
public class EnhancedFor {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        for (int num:array) {
            System.out.println(num);
        }

        System.out.println("====================");

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("Pyhton");
        for (String s: list) {
            System.out.println(s);
        }



        List<Student> ls = new ArrayList<Student>();
        ls.add(new Student("大哈",22,98));

        for (Student stu : ls) {
            System.out.println(stu);
        }
    }
}
