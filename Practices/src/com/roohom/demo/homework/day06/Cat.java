package com.roohom.demo.homework.day06;

/**
 * ClassName: Cat
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:30
 * Software: IntelliJ IDEA
 */
public class Cat {
    private String color;
    private String breed;

    //方法
    public void eat() {
        System.out.println(color+"的"+breed+"猫正在吃鱼.....");
    }

    public void catchMouse() {
        System.out.println(color+"的"+breed+"猫正在逮老鼠....");
    }

    //无参构造
    public Cat() {
    }

    //有参构造
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
