package com.roohom.demo.homework.day10.CollectionObj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: CollectOperation
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 19:06
 * Software: IntelliJ IDEA
 */
public class CollectOperation {
    public static void main(String[] args) {
        //定义一个存储字符串的集合对象
        List<String> coll = new ArrayList<>();

        //添加元素
        coll.add("孙悟空");
        coll.add("猪八戒");
        coll.add("沙和尚");
        coll.add("铁扇公主");

        //不用遍历打印集合
        System.out.println(coll);

        //获取第四个元素
        System.out.println(coll.get(3));
        //打印集合大小
        System.out.println("集合大小是:"+coll.size());

        //删除铁扇公主
        coll.remove("铁扇公主");
        System.out.println(coll);
        //删除第三个元素
        coll.remove(2);
        System.out.println(coll);
        //将猪八戒改为猪无能
        coll.set(1,"猪悟能");
        System.out.println(coll);

    }
}
