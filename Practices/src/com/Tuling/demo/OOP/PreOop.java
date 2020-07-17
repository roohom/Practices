package com.Tuling.demo.OOP;

/**
 * ClassName: PreOop
 * Author: Roohom
 * Function:模拟面向过程 将大象装进冰箱
 * Date: 2020/7/17 15:08
 * Software: IntelliJ IDEA
 */
public class PreOop {
    public static void main(String[] args) {

        //面向过程的写法，代码一多，每次需要执行的时候都需要执行写一遍代码，重复利用率不高
        //这个时候就要考虑将代码封装成方法
        System.out.println("打开冰箱门");
        System.out.println("装进大象");
        System.out.println("关闭冰箱门");
        System.out.println("----------------------");

        open();
        in();
        close();
    }

    public static void open() {
        System.out.println("打开冰箱门");
    }

    public static void in() {
        System.out.println("装进大象");
    }
    public static void close()
    {
        System.out.println("关闭冰箱门");
    }



}
