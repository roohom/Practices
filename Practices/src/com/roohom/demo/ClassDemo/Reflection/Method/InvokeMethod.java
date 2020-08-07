package com.roohom.demo.ClassDemo.Reflection.Method;

import com.roohom.demo.ClassDemo.Reflection.Constructor.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.ClosedSelectorException;

/**
 * ClassName: InvokeMethod
 * Author: Roohom
 * Function:反射，调用成员方法
 * Date: 2020/8/5 18:17
 * Software: IntelliJ IDEA
 */
public class InvokeMethod {
    public static void main(String[] args) {
        System.out.println("调用无参的public方法");
        noArgsCons();
        System.out.println("调用无参的private方法");
        noArgsPrivate();
        System.out.println("调用有参数有返回值的public方法");
        haveArgsReturn();
        System.out.println("调用有参数有返回值的private方法");
        haveArgsReturnPrivate();
    }

    public static void noArgsCons() {
        Class clazz = Student.class;
        try {
            Method method = clazz.getMethod("study");
            method.invoke(clazz.newInstance());

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void noArgsPrivate() {
        try {
            Class clazz = Class.forName("com.roohom.demo.ClassDemo.Reflection.Constructor.Student");
            Method method = clazz.getDeclaredMethod("seeAMoivie");
            method.setAccessible(true);
            method.invoke(clazz.newInstance());

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void haveArgsReturn() {
        Class clazz = Student.class;
        try {
            Method method = clazz.getMethod("ifEven", int.class);

            boolean flag = (boolean) method.invoke(clazz.newInstance(), 25);
            System.out.println(flag);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void haveArgsReturnPrivate() {
        Class clazz = Student.class;
        try {
            Method method = clazz.getDeclaredMethod("ifOddd", int.class);
            boolean flag = (boolean) method.invoke(clazz.newInstance(),23);
            System.out.println(flag);

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    //以上获得对象的方法的方式在jdk9之后显示过时，即method(clazz.newINstance())过时
}
