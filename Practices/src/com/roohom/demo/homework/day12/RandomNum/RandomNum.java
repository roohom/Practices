package com.roohom.demo.homework.day12.RandomNum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: RandomNum
 * Author: Roohom
 * Function:将集合内包含数字的串删除
 * Date: 2020/7/28 19:55
 * Software: IntelliJ IDEA
 */
public class RandomNum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //随机生成8个随机数装入列表
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            int num = (int) (Math.random() * 20 + 1);
            if (num%2==0)
                list.add(num);
            sum += list.get(i);
            System.out.print(list.get(i) + " ");
        }
        double avg = sum/8;
        System.out.println("平均数是:" + avg);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<avg) {
                list.remove(i);
                i--;
            }
        }

        //增强for删除和打印集合中元素
        System.out.println("使用增强for打印元素:");
        for (Integer n : list) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("使用迭代器打印元素:");
        Iterator<Integer> iterator = list.iterator();
        //迭代器打印集合中的元素
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }
    }
}
