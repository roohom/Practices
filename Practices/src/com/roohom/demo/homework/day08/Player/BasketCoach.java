package com.roohom.demo.homework.day08.Player;

import com.roohom.demo.homework.day08.Phone.Phone;

/**
 * ClassName: BasketCoach
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 19:55
 * Software: IntelliJ IDEA
 */
public class BasketCoach extends Coach {

    //重写父类的构造方法
    public BasketCoach() {
    }

    public BasketCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃该吃的");
    }


    @Override
    public void coach() {
        System.out.println("篮球教练教如何发球和运球");
    }
}
