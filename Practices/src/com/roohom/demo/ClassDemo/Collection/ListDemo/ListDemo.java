package com.roohom.demo.ClassDemo.Collection.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 16:13
 * Software: IntelliJ IDEA
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("pyhton");
        System.out.println(list);

        //遍历
        Iterator it = list.iterator();
        //快捷键itit生成下面代码
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);

        }


    }
}
