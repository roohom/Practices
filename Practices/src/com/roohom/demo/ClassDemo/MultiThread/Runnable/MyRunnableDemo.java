package com.roohom.demo.ClassDemo.MultiThread.Runnable;

/**
 * ClassName: MyRunnableDemo
 * Author: Roohom
 * Function:测试类
 * Date: 2020/8/2 08:32
 * Software: IntelliJ IDEA
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr,"小黄");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("大黑:"+i);
        }
    }
}
