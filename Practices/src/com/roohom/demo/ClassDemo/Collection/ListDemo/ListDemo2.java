package com.roohom.demo.ClassDemo.Collection.ListDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ListDemo2
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 16:23
 * Software: IntelliJ IDEA
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("新元素");
        list.add(0, "java");
        list.add(0, "Python");
        list.add(0, "Hello");


        System.out.println(list);


        list.set(3, "后来的往前靠");
        System.out.println(list);

        if (list.contains("java")) {
            int index = list.indexOf("java");
            list.remove(index);
        }
        System.out.println(list);

        System.out.println(list.get(0));

    }
}
