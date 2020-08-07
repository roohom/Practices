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

        //使用for循环删除指定条件的元素
        for (int i = 0; i < aeg.size(); i++) {
            if (aeg.get(i).getSex().equals("男") && aeg.get(i).getName().length() >= 3) {
                aeg.remove(i);
                //关键代码
                //当删除一个之后，索引会自动减1，后面的元素会自动向前移动一位
                i--;
            }
        }

        //使用迭代器进行删除,好处是不需要考虑索引
        Iterator<Avengers> iterator = aeg.iterator();
//        aeg.removeIf(avengers -> avengers.getName().length() >= 3 && avengers.getSex().equals("男"));
        while (iterator.hasNext()) {
            Avengers avengers = iterator.next();
            if (avengers.getName().length() >= 3 && avengers.getSex().equals("男"))
                //迭代器删除，此时不能使用列表的删除方法，否则报错
                iterator.remove();
        }
        System.out.println(aeg.toString());
    }
}
