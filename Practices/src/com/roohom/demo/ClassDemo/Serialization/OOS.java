package com.roohom.demo.ClassDemo.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ClassName: OOS
 * Author: Roohom
 * Function:序列化·写
 * Date: 2020/7/31 16:16
 * Software: IntelliJ IDEA
 */
public class OOS {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student stu = new Student();
            stu.name=  "xiong大";
            stu.age= 23;
            stu.addr = "上海";
            oos.writeObject(stu);

            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
