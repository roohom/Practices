package com.roohom.demo.ClassDemo.Collection.ListDemo;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListDemo3
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 16:45
 * Software: IntelliJ IDEA
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Hello");
        list.add("Python");
        list.add("World!");

        //遍历集合
        Iterator it= list.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }

        //遍历方式二:for+ 集合大小+索引
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }


    }
}
