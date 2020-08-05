package com.roohom.demo.ClassDemo.Reflection.Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: ConstructorDemo
 * Author: Roohom
 * Function: 反射机制实例化一个对象
 * Date: 2020/8/5 10:04
 * Software: IntelliJ IDEA
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("======第一种方式======");
        getCons();
        System.out.println("======第二种方式======");

        //获取到Student的class对象
        Class stuClass = Student.class;
        try {
            //利用class对象获取Student中的有参构造
            Constructor cons = stuClass.getConstructor(String.class, int.class);
            //利用构造器实例化Student类
            Student stu = (Student) cons.newInstance("王铁锤", 22);
            stu.study();

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("======第三种方式======");
        getConsDelcared();

    }
    //不包括私有构造
    public static void getCons() {
        try {
            Class stuClass = Class.forName("com.roohom.demo.ClassDemo.Reflection.Constructor.Student");
            Constructor[] conss = stuClass.getConstructors();

            for (Constructor cons : conss) {
                System.out.println(cons);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void getConsDelcared() {
        Class clazz = Student.class;
        try {
            Constructor cons = clazz.getDeclaredConstructor(String.class, int.class);

            //去除私有权限
            cons.setAccessible(true);

            Student student = (Student) cons.newInstance("张大强", 23);
            student.study();

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
