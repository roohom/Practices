package com.Tuling.demo.OOP;

/**
 * ClassName: TestSingleton
 * Author: Roohom
 * Function:自定义TestSingleton类，在main方法中有且只能得到Singleton类中的一个对象
 * Date: 2020/7/20 16:01
 * Software: IntelliJ IDEA
 */
public class TestSingleton {
    public static void main(String[] args) {
////        Singleton s1 = new Singleton();
////        Singleton s2 = new Singleton();
//
//        //false 得到的singleton类中的两个对象不是同一个
//        System.out.println(s1==s2);

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2); //true
    }
}
