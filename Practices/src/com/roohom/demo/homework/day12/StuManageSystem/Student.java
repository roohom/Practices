package com.roohom.demo.homework.day12.StuManageSystem;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:学生类
 * Date: 2020/7/28 21:33
 * Software: IntelliJ IDEA
 */
public class Student {
    private int ID;
    private String name;
    private int age;
    private String addr;

    public Student() {
    }

    public Student(int ID, String name, int age, String addr) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "学号" +"\t"+ "姓名"+"\t" + "年龄"+"\t" + "地址" + '\n' +
                ID + "\t" + name + "\t" + age + "\t" + addr + "";
    }
}
