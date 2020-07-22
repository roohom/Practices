package com.roohom.demo.homework.day08.Player;

/**
 * ClassName: PingPangCoach
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 19:53
 * Software: IntelliJ IDEA
 */
public class PingPangCoach extends Person implements English{
    @Override
    public void eat() {
        System.out.println("乒乓球教练吃该吃的");
    }

    public void coachPingpang()
    {
        System.out.println("乒乓球教练教如何发球");
    }

    @Override
    public void LearningEnglish() {
        System.out.println("乒乓球教练学习英语");
    }
}
