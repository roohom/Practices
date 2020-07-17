package com.Tuling.demo.OOP;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

/**
 * ClassName: TestGoods
 * Author: Roohom
 * Function:
 * Date: 2020/7/17 21:17
 * Software: IntelliJ IDEA
 */
public class TestGoods {
    public static void main(String[] args) {
        Goods goods = new Goods();

        goods.getName();
        goods.getPrice();
        goods.getNumber();

        System.out.println("商品名称:"+goods.getName());
        System.out.println("商品价格:"+goods.getPrice());
        System.out.println("商品数量:"+goods.getNumber());

        goods.show("Java从入门到入坟",998);
    }
}
