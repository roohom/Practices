package com.roohom.demo.homework.day07.Animals;

/**
 * ClassName: Sheep
 * Author: Roohom
 * Function:羊类
 * Date: 2020/7/21 20:00
 * Software: IntelliJ IDEA
 */
public class Sheep extends Animal{
    @Override
    public void drink() {
        System.out.println("羊喝水");
    }

    @Override
    public void eat() {
        System.out.println("羊啃草");
    }
}
