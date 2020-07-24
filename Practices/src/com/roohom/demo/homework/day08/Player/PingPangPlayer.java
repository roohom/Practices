package com.roohom.demo.homework.day08.Player;

import com.roohom.demo.homework.day08.Phone.Phone;
import sun.usagetracker.UsageTrackerClient;

/**
 * ClassName: PingPangPlayer
 * Author: Roohom
 * Function:乒乓球运动员类
 * Date: 2020/7/22 19:43
 * Software: IntelliJ IDEA
 */
public class PingPangPlayer extends Player implements English{
    @Override
    public void eat() {
        System.out.println("乒乓运动员吃该吃的");
    }

    @Override
    public void  learnPlay()
    {
        System.out.println("乒乓球运动员学习如何发球");
    }

    @Override
    public void LearningEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
