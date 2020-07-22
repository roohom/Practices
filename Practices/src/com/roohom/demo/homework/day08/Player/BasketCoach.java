package com.roohom.demo.homework.day08.Player;

import com.roohom.demo.homework.day08.Phone.Phone;

/**
 * ClassName: BasketCoach
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 19:55
 * Software: IntelliJ IDEA
 */
public class BasketCoach extends Person {

    @Override
    public void eat() {
        System.out.println("篮球教练吃该吃的");
    }

    public void coachBasketball()
    {
        System.out.println("篮球教练教运球和投篮");
    }
}
