package com.roohom.demo.ClassDemo.OOP.Polymorphism.ClassicCase;

/**
 * ClassName: B
 * Author: Roohom
 * Function:
 * Date: 2020/7/23 17:18
 * Software: IntelliJ IDEA
 */
public class B extends A{
    public String show(B obj){
        return ("B and B");
    }

    public String show(A obj){
        return ("B and A");
    }
}
