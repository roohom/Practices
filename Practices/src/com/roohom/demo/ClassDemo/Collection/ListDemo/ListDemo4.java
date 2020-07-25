package com.roohom.demo.ClassDemo.Collection.ListDemo;

import com.roohom.demo.homework.day09.ScoreManageSystem.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListDemo4
 * Author: Roohom
 * Function:创建一个从来存储Student类型的List集合
 * Date: 2020/7/25 16:49
 * Software: IntelliJ IDEA
 */
public class ListDemo4 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student("白菜",22,98);
        list.add(stu1);

        //遍历
        System.out.println("使用迭代器：");
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student next =  it.next();
            System.out.println(next);
        }

        //for循环
        System.out.println("使用for循环：");
        for (int i = 0; i < list.size(); i++) {
            Student  stu = list.get(i);
            System.out.println(stu);
        }
    }
}
