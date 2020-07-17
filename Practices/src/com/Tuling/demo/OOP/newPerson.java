package com.Tuling.demo.OOP;

/**
 * ClassName: newPerson
 * Author: Roohom
 * Function:
 * Date: 2020/7/17 20:31
 * Software: IntelliJ IDEA
 */
public class newPerson {
    public static void main(String[] args) {
        //创建Person对象
        //左边的引用 用于记录右边的地址
        Person p = new Person();
        p.name = "李大白菜";
        p.age = 18;

        System.out.println(p.name+"  "+p.age);

        //调用成员方法
        p.show();
    }
}
