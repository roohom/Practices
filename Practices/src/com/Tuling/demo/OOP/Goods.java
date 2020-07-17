package com.Tuling.demo.OOP;

/**
 * ClassName: Goods
 * Author: Roohom
 * Function:
 * Date: 2020/7/17 21:14
 * Software: IntelliJ IDEA
 */
public class Goods {
    String name;  //名称
    double price; //价格
    int number;   //类型
    String tname; //类型

    String getName(){
        return "俄罗斯套娃";
    }

    double getPrice(){
        return 399;
    }

    int getNumber(){
        return 10;
    }

    void show(String name,double price){
        System.out.println(name+"   "+price);
    }

}


