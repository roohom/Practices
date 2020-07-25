package com.roohom.demo.ClassDemo.Collection.Traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: demo
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 15:41
 * Software: IntelliJ IDEA
 */
public class demo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("java");
        coll.add("hadoop");
        coll.add("hive");
        coll.add("sqoop");
        coll.add("flink");

        //遍历集合,借助迭代器
        Iterator it = coll.iterator();
        //循环
        while (it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("===============");
        for (Object s:coll) {
            System.out.println(s);
        }


    }
}
