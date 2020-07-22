package com.roohom.demo.ClassDemo.API.EqualsDemo;

/**
 * ClassName: TestStudent
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 17:31
 * Software: IntelliJ IDEA
 */
public class TestStudent {
    public static void main(String[] args) {

        Student stu = new Student("李大强",22);
        Student stu2 = new Student("王大壮",44);
        Student stu3 = new Student("李大强",22);

        System.out.println(stu.toString());
        System.out.println(stu2.toString());

        System.out.println(stu.equals(stu2));
        System.out.println(stu.equals(stu3));

    }
}
