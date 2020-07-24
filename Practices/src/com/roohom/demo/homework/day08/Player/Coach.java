package com.roohom.demo.homework.day08.Player;

/**
 * ClassName: Coach
 * Author: Roohom
 * Function:
 * Date: 2020/7/24 09:05
 * Software: IntelliJ IDEA
 */
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void coach();
}
