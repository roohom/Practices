package com.roohom.demo.homework.day08.Player;

/**
 * ClassName: BasketballPlayer
 * Author: Roohom
 * Function:篮球远动员类
 * Date: 2020/7/22 19:46
 * Software: IntelliJ IDEA
 */
public class BasketballPlayer extends Player{

    @Override
    public void eat() {
        System.out.println("篮球运动员吃该吃的");
    }

    @Override
    public void learnPlay() {

    }


    public void palyBasketball()
    {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}
