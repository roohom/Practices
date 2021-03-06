package com.roohom.demo.homework.day08.Player;

/**
 * ClassName: Person
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 19:47
 * Software: IntelliJ IDEA
 */
public abstract class Person {
    private String name;
    private int age;

    //抽象类中的抽象方法
    public  abstract void eat();

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
}
