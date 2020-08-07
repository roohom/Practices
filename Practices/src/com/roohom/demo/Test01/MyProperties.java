package com.roohom.demo.Test01;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName: Properties
 * Author: Roohom
 * Function:从一个properties读写到另一个properties
 * Date: 2020/8/7 09:42
 * Software: IntelliJ IDEA
 */
public class MyProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Properties newProperties = new Properties();
        try {
            properties.load(new InputStreamReader(new FileInputStream(new File("Student.txt"))));

            BufferedWriter bw = new BufferedWriter(new FileWriter("newstu.txt"));

            Set<String> keys = properties.stringPropertyNames();
            for (String key : keys) {
                if (key.equals("刘方"))
                    properties.setProperty(key,"18");
                //System.out.println(key+":"+properties.getProperty(key));
                newProperties.setProperty(key,properties.getProperty(key));
            }
            newProperties.store(bw,null);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
