package com.roohom.demo.homework.day17.PrintStr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionPrintStr
 * Author: Roohom
 * Function:反射机制调用方法打印字符串
 * Date: 2020/8/5 19:05
 * Software: IntelliJ IDEA
 */
public class ReflectionPrintStr {
    public static void main(String[] args) {
        //反射获取字节码
        Class clazz = PrintStr.class;
        try {
            //获取method
            Method method = clazz.getMethod("printStr");
            //invoke调用方法
            method.invoke(clazz.newInstance());
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
