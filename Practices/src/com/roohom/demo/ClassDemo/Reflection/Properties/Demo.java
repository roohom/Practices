package com.roohom.demo.ClassDemo.Reflection.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * ClassName: Demo
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 11:15
 * Software: IntelliJ IDEA
 */
public class Demo {
    public static void main(String[] args) {
        Properties prep = new Properties();

        prep.setProperty("filename","hello.txt");
        prep.setProperty("length","1024");
        prep.setProperty("location","d:/hello.txt");

        System.out.println(prep.getProperty("filename"));
        System.out.println(prep.getProperty("length"));
        System.out.println(prep.getProperty("location"));

        System.out.println("===================");
        Set<String> keys = prep.stringPropertyNames();
        for (String key : keys) {
            System.out.println(prep.getProperty(key));
        }
    }
}
