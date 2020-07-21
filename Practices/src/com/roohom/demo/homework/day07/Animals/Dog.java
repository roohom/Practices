package com.roohom.demo.homework.day07.Animals;

/**
 * ClassName: Dog
 * Author: Roohom
 * Function:狗类
 * Date: 2020/7/21 19:58
 * Software: IntelliJ IDEA
 */
public class Dog extends Animal implements Swim{

    @Override
    public void drink() {
        System.out.println("狗喝水");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗会狗刨游泳");
    }
}
