package com.roohom.demo.ClassDemo.OOP.Polymorphism.ClassicCase;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:
 * Date: 2020/7/23 17:18
 * Software: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        String test1 = a1.show(b);
        System.out.println(test1);
//        System.out.println("1--" + a1.show(b));   // A and A

        String test2 = a1.show(c);
        System.out.println(test2);
//        System.out.println("2--" + a1.show(c));   // A and A

        String test3 = a1.show(d);
        System.out.println(test3);
//        System.out.println("3--" + a1.show(d));   // A and D

        String test4 = a2.show(b);
        System.out.println(test4);
//        System.out.println("4--" + a2.show(b));   // B and A

        String test5 = a2.show(c);
        System.out.println(test5);
//        System.out.println("5--" + a2.show(c));   // B and A
        String test6 = a2.show(d);
        System.out.println(test6);
//        System.out.println("6--" + a2.show(d));   // A and D

        String test7 = b.show(b);
        System.out.println(test7);
//        System.out.println("7--" + b.show(b));    // B and B
        String test8 = b.show(c);
        System.out.println(test8);
//        System.out.println("8--" + b.show(c));    // B and B
        String test9 = b.show(d);
        System.out.println(test9);
//        System.out.println("9--" + b.show(d));    // A and D

    }
}
