package com.roohom.demo.ClassDemo.Collection.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName: ListIteratorDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 17:15
 * Software: IntelliJ IDEA
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Hello");
        list.add("Python");
        list.add("World!");

//        //遍历集合
//        Iterator it= list.iterator();
//        while (it.hasNext()) {
//            Object next =  it.next();
//            System.out.println(next);
//        }

        ListIterator listIt = list.listIterator();
        while (listIt.hasNext()) {
            String next = (String) listIt.next();
            if (next.equals("Hello"))
                listIt.add("Java");
        }

        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            if (str.equals("Java"))
                list.add("新Java");
        }

        System.out.println(list);

    }

}
