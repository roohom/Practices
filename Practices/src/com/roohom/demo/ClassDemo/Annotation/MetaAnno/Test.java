package com.roohom.demo.ClassDemo.Annotation.MetaAnno;

import java.lang.annotation.Annotation;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 15:22
 * Software: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {
        //获取
        Class clazz = MetaAnnotation.class;

        //Student student = (Student) clazz.getAnnotation(Student.class);
        //System.out.println(student.name());//拿不到名字

        Annotation[] ans = clazz.getAnnotations();
        for (Annotation an : ans) {
            System.out.println(an);
        }
    }
}
