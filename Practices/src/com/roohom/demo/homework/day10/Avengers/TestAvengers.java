package com.roohom.demo.homework.day10.Avengers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: TestAvengers
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 19:32
 * Software: IntelliJ IDEA
 */
public class TestAvengers {
    public static void main(String[] args) {
        Avengers ironMan = new Avengers(1, "钢铁侠", "男");
        Avengers captain = new Avengers(2, "美国队长", "男");
        Avengers black = new Avengers(3, "黑寡妇", "女");
        Avengers greenBoy = new Avengers(4, "绿巨人", "男");
        Avengers thunder = new Avengers(5, "雷神", "男");
        Avengers star = new Avengers(6, "星云", "女");

        List<Avengers> aeg = new ArrayList<>();
        aeg.add(ironMan);
        aeg.add(captain);
        aeg.add(black);
        aeg.add(greenBoy);
        aeg.add(thunder);
        aeg.add(star);

        Iterator<Avengers> iterator = aeg.iterator();
//        aeg.removeIf(avengers -> avengers.getName().length() >= 3 && avengers.getSex().equals("男"));
        while (iterator.hasNext()) {
            Avengers avengers =  iterator.next();
            if (avengers.getName().length() >= 3 && avengers.getSex().equals("男"))
                iterator.remove();
        }
        System.out.println(aeg.toString());
    }
}
