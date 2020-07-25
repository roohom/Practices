package com.roohom.demo.ClassDemo.Collection.AnonymousInnerClass;

/**
 * ClassName: demo
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 12:16
 * Software: IntelliJ IDEA
 */


public abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class AnimalTest{
    public static void main(String[] args) {
        //第一种方法:
        Animal an = new Cat();
        an.eat();
        System.out.println("================");
        //第二种方法:
        new Cat().eat();
        System.out.println("================");

        //第三种方法:
        new Animal()
        {
            @Override
            public void eat() {
                System.out.println("这是通过匿名内部类形式创建的Animal子类对象");
            }
        }.eat();
    }
}