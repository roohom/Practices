package com.roohom.demo.homework.day11.Person;

/**
 * ClassName: Person
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 18:56
 * Software: IntelliJ IDEA
 */
public class Person {
    private String name;
    private int age;
    private String sex;
    private String tel;
    private String addr;

    public Person() {
    }

    public Person(String name, int age, String sex, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
        this.addr = addr;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
