package com.roohom.demo.ClassDemo.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * ClassName: ArrayListDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 11:16
 * Software: IntelliJ IDEA
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("da");
        list.add("xao");
        list.add("adde");

        //遍历
        //迭代器
        ListIterator<String> sli = list.listIterator();
        while (sli.hasNext()) {
            Object next =  sli.next();
            System.out.println(next.toString());
        }


        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }


        for (String str: list) {
            System.out.println(str);
        }


    }
}
