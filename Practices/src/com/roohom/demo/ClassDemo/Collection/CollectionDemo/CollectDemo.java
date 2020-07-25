package com.roohom.demo.ClassDemo.Collection.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: CollectDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 15:02
 * Software: IntelliJ IDEA
 */
public class CollectDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        System.out.println("初始化长度:"+coll.size());

        System.out.println("存储的元素全部类型提升为:Object");
        System.out.println("自动装箱");
        coll.add("String");
        coll.add(100);   // 自动装箱 int -> Integer Integer -> 类型提升 ->Object
        coll.add(122222.2222);
        coll.add(true);
        System.out.println("目前长度:"+coll.size());

        System.out.println(coll.toString());//ArrayList重写了toString方法

    }
}
