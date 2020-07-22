package com.roohom.demo.ClassDemo.OOP.Polymorphism;

/**
 * ClassName: Cat
 * Author: Roohom
 * Function:猫类
 * Date: 2020/7/22 11:32
 * Software: IntelliJ IDEA
 */
public class Cat extends Animal {
    //构造方法
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //成员方法
    //重写Animal#eat()

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //定义自己独有的行为
    public void catchMouse() {
        System.out.println("猫会抓老鼠");
    }
}


