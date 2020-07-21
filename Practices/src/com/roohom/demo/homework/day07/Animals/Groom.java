package com.roohom.demo.homework.day07.Animals;

/**
 * ClassName: Groom
 * Author: Roohom
 * Function:饲养员类
 * Date: 2020/7/21 20:13
 * Software: IntelliJ IDEA
 */
public class Groom extends Animal{

    @Override
    public void drink() {
        System.out.println("饲养员喝水");
    }

    @Override
    public void eat() {
        System.out.println("饲养员吃饭");
    }

    public static void grooming(Animal an)
    {
        an.drink();
        an.eat();
        if (an instanceof Dog)
        {
            Dog d = (Dog)an;
            d.swim();
        }
        else if(an instanceof frog)
        {
            frog f = (frog)an;
            f.swim();
        }
    }
}
