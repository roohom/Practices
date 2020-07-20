package com.roohom.demo.homework.day06;

/**
 * ClassName: GirlFriend
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:04
 * Software: IntelliJ IDEA
 */
public class GirlFriend {
    private String name;
    private double high;
    private double heavy;

    //无参构造
    public GirlFriend() {
    }
    //有参构造
    public GirlFriend(String name, double high, double heavy) {
        this.name = name;
        this.high = high;
        this.heavy = heavy;
    }


    //方法
    public void wash()
    {
        System.out.println("女朋友帮我做饭");
    }

    public void cook()
    {
        System.out.println("女朋友帮我洗衣服");
    }

    public void show()
    {
        System.out.println("我女朋友叫"+name+",身高"+high+"厘米,体重"+heavy+"斤");
    }
}
