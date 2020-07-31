package com.roohom.demo.ClassDemo.Serialization;

import java.io.Serializable;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:
 * Date: 2020/7/31 16:16
 * Software: IntelliJ IDEA
 */

//类实现了序列化接口(Student对象可以本地磁盘存储，也可以在网络上传输)
public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    String name;
    int age;
    transient String addr; //不希望这个属性序列化



    public Student() {
    }

    public Student(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
