package com.roohom.demo.homework.day17.Properties;

import com.roohom.demo.homework.day11.Person.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ClassName: ReadPropertiesAndRun
 * Author: Roohom
 * Function:读取配置文件的内容，并用反射的方式加载run
 * Date: 2020/8/5 19:39
 * Software: IntelliJ IDEA
 */
public class ReadPropertiesAndRun {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("Student.txt"));
            String className = properties.getProperty("fullClassName");

            Class clazz = Class.forName(className);
            Method method = clazz.getMethod("run");
            method.invoke(clazz.newInstance());

        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
