package com.roohom.demo.ClassDemo.Annotation.AnnoLife;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:模拟Junit
 * Date: 2020/8/5 15:56
 * Software: IntelliJ IDEA
 */
public class Test {

    //执行所有的@MyTest方法
    //问: @MyTest书写在的位置？
    //    方法上
    //问:所有的方法都会执行吗？
    //   不是 只有书写了@MyTest的才会执行
    //获取所有方法
    //遍历数组
    //判断每个Method是否有@MyTest方法
    // 有 invoke

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.roohom.demo.ClassDemo.Annotation.AnnoLife.TestMyJunit");

            //获取所有的方法
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                //判断当前方法上是否有注解
                if (method.isAnnotationPresent(MyTest.class)) {
                    method.setAccessible(true);
                    method.invoke(clazz.newInstance());
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
