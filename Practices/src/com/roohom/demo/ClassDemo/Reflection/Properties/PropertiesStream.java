package com.roohom.demo.ClassDemo.Reflection.Properties;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName: PropertiesStream
 * Author: Roohom
 * Function:读取配置文件内容，并遍历配置文件
 * Date: 2020/8/5 11:20
 * Software: IntelliJ IDEA
 */
public class PropertiesStream {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            //特点:IO流，可以读取配置文件中的内容
            properties.load(new FileInputStream("Student.txt"));
            System.out.println(properties);
            System.out.println(properties.getProperty("className"));
            System.out.println("==========================");

            //遍历properties，获取里面的内容
            Set<String> keys = properties.stringPropertyNames(); //获取所有的key元素
            for (String key : keys) {
                System.out.println(key+"==="+properties.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
