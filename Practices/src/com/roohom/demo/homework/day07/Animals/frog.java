package com.roohom.demo.homework.day07.Animals;

/**
 * ClassName: frog
 * Author: Roohom
 * Function:青蛙类
 * Date: 2020/7/21 20:09
 * Software: IntelliJ IDEA
 */
public class frog extends Animal implements Swim{
    @Override
    public void drink() {
        System.out.println("青蛙喝水");
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃小虫");
    }

    @Override
    public void swim() {
        System.out.println("青蛙会游泳");
    }
}
