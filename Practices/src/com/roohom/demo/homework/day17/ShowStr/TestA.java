package com.roohom.demo.homework.day17.ShowStr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ClassName: TestA
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 19:14
 * Software: IntelliJ IDEA
 */
public class TestA {
    public static void main(String[] args) {
        //String input = new Scanner(System.in).next();
        String input = "com.roohom.demo.homework.day17.ShowStr.ClassA";
        try {
            Class clazz = Class.forName(input);

            Method method = clazz.getMethod("showString", String.class);
            method.invoke(clazz.newInstance(), input);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
