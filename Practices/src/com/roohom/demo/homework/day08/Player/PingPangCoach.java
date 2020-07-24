package com.roohom.demo.homework.day08.Player;

/**
 * ClassName: PingPangCoach
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 19:53
 * Software: IntelliJ IDEA
 */
public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃该吃的");
    }

//    public void coachPingpang()
//    {
//        System.out.println("乒乓球教练教如何发球");
//    }

    @Override
    public void LearningEnglish() {
        System.out.println("乒乓球教练学习英语");
    }

    @Override
    public void coach() {
        System.out.println("乒乓球教练教如何发球");
    }
}
