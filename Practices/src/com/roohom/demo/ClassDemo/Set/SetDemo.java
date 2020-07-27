package com.roohom.demo.ClassDemo.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: SetDemo
 * Author: Roohom
 * Function:Set集合
 * Date: 2020/7/27 11:53
 * Software: IntelliJ IDEA
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("s1");
        set.add("hello");
        set.add("s2");

        System.out.println(set);
        System.out.println(set.size());
        System.out.println("=====================");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.println(next);
        }
        System.out.println("======================");
        //遍历
        for (String s : set) {
            System.out.print(s+" ");
        }

    }
}
