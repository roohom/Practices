package com.roohom.demo.homework.day10.Plant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: TestPlant
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 21:16
 * Software: IntelliJ IDEA
 */
public class TestPlant {
    public static void main(String[] args) {
        Plant pt1 = new Plant("多肉",20);
        Plant pt2 = new Plant("百合",30);
        Plant pt3 = new Plant("玫瑰",50);

        List<Plant> ls = new ArrayList();
        ls.add(pt1);
        ls.add(pt2);
        ls.add(pt3);

        Iterator<Plant> it = ls.iterator();
        while (it.hasNext()) {
            Plant next =  it.next();
            if (next.getName().equals("玫瑰")) {
                next.setPrice((next.getPrice()+50));
            }
        }
        for (int i = 0; i < ls.size(); i++) {
            ls.get(i).showInfo();
        }
    }
}
