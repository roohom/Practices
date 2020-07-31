package com.roohom.demo.ClassDemo.Serialization;

import java.io.*;

/**
 * ClassName: ReadObject
 * Author: Roohom
 * Function:反序列化
 * Date: 2020/7/31 16:24
 * Software: IntelliJ IDEA
 */
public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();

            Student stu = (Student) obj;
            System.out.println(stu);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
