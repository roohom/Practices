package com.roohom.demo.homework.day10.JourneyToTheWest;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: CollectOperation
 * Author: Roohom
 * Function:
 * - 定义一个只能存储字符串的集合对象；
 * - 向集合内添加以下数据：
 * ​      	“孙悟空”
 * ​       	“猪八戒”
 * ​       	“沙和尚”
 * ​      	“铁扇公主”
 * - 不用遍历，直接打印集合；
 * - 获取第4个元素（注意，是--第4个元素，它的索引是？）
 * - 打印一下集合大小；
 * - 删除元素“铁扇公主”
 * - 删除第3个元素（注意：是--第3个元素）
 * - 将元素“猪八戒”改为“猪悟能”
 * - 再次打印集合；
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
        //将猪八戒改为猪悟能
        for (int i = 0; i < coll.size(); i++) {
            if (coll.get(i).equals("猪八戒"))
                coll.set(i,"猪悟能");
        }
        System.out.println(coll);


//        //使用collection不是那么方便
//
//        Collection coll = new ArrayList();
//        //添加元素
//        coll.add("孙悟空");
//        coll.add("猪八戒");
//        coll.add("沙和尚");
//        coll.add("铁扇公主");
//
//        System.out.println(coll);
//        //获取第四个元素
//        System.out.println(((ArrayList) coll).get(3));
//        //打印集合大小
//        System.out.println("集合大小是:"+coll.size());
//        //删除铁扇公主
//        coll.remove("铁扇公主");
//        coll.remove(2);

    }
}
