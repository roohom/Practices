package com.Tuling.demo.OOP;

/**
 * ClassName: Singleton
 * Author: Roohom
 * Function:singleton类的封装  单例设计模式
 * Date: 2020/7/20 16:01
 * Software: IntelliJ IDEA
 */
public class Singleton {
    //被static修饰的只有一份
    private static Singleton s = new Singleton(); //饿汉式
    private static Singleton sin = null;          //懒汉式

    //自定义无参的构造方法，使用private关键字来修饰
    private Singleton(){

    }
    //提供一个共有的get成员变量的方法将成员变量返回
    public static Singleton getInstance()
    {
        if (sin==null)
        {
            sin = new Singleton();
        }
        return sin;
    }
}
