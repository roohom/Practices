package com.roohom.demo.homework.day06;

/**
 * ClassName: TestCatDog
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:39
 * Software: IntelliJ IDEA
 */
public class TestCatDog {
    public static void main(String[] args) {
        Cat cat = new Cat("花色","波斯猫");
        cat.eat();
        cat.catchMouse();

        Dog dog = new Dog("黑色","藏獒");
        dog.eat();
        dog.lookHome();
    }
}
