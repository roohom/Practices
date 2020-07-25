package com.roohom.demo.ClassDemo.Collection.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: Generic
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 15:15
 * Software: IntelliJ IDEA
 */
public class Generic {
    public static void main(String[] args) {
        //泛型：约束集合中所能存储的类型
        Collection<String> coll  = new ArrayList<String>();

        //coll.add(100)编译报错
        coll.add("100");

        Collection<String> col = new ArrayList<>();
        col.add("只能是String");

        System.out.println(coll.toString());
        System.out.println(col.toString());
        System.out.println(col);
    }
}
