package com.roohom.demo.ClassDemo.Annotation.MetaAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

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

        try {
            Method method = clazz.getMethod("show");
            if (clazz.isAnnotationPresent(Student.class)) {
                Student stu = method.getAnnotation(Student.class);
                System.out.println("名字:" + stu.name());
            }
            else
                System.out.println("没有注解！");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //Student student = (Student) clazz.getAnnotation(Student.class);
        //System.out.println(student.name());//拿不到名字

        Annotation[] ans = clazz.getAnnotations();
        for (Annotation an : ans) {
            System.out.println(an);
        }
    }
}
