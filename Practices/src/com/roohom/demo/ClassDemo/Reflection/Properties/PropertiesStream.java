package com.roohom.demo.ClassDemo.Reflection.Properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName: PropertiesStream
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 11:20
 * Software: IntelliJ IDEA
 */
public class PropertiesStream {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("file.txt"));
            System.out.println(properties);
            System.out.println(properties.getProperty("className"));
            System.out.println("==========================");

            Set<String> keys = properties.stringPropertyNames();
            for (String key : keys) {
                System.out.println(key+"==="+properties.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
