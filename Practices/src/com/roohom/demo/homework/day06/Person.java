package com.roohom.demo.homework.day06;

/**
 * ClassName: Person
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:47
 * Software: IntelliJ IDEA
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    //行为
    public void eat() {
        System.out.println("人都需要吃饭");
    }
}
