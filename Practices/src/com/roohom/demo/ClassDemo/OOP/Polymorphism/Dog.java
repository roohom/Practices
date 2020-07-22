package com.roohom.demo.ClassDemo.OOP.Polymorphism;

/**
 * ClassName: Dog
 * Author: Roohom
 * Function:狗类
 * Date: 2020/7/22 11:33
 * Software: IntelliJ IDEA
 */
public class Dog extends Animal{
    //构造方法
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    //成员方法
    //重写Animal#eat()
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    //定义自己独有的行为
    public void lookHome() {
        System.out.println("狗会看家!");
    }
}

//扩展: instanceof 关键字.
/*
   instanceof 关键字
       格式:
            引用(对象)   instanceof   数据类型
       作用:
            用来判断前边的引用(或者是对象) 是否是 后边的数据类型.
        例如:
            Cat c = new Cat();

            c instanceof Cat        ->  true
            c instanceof Dog        ->  false
 */

