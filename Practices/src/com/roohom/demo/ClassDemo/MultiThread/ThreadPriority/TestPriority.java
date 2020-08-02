package com.roohom.demo.ClassDemo.MultiThread.ThreadPriority;

import sun.awt.windows.ThemeReader;

/**
 * ClassName: TestPriority
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 18:02
 * Software: IntelliJ IDEA
 */
public class TestPriority {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        t1.setName("高铁");
        t2.setName("飞机");
        t3.setName("轮船");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();


    }
}
