package com.roohom.demo.ClassDemo.OOP.Polymorphism.ClassicCase;

/**
 * ClassName: A
 * Author: Roohom
 * Function:
 * Date: 2020/7/23 17:17
 * Software: IntelliJ IDEA
 */
public class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}
