package com.roohom.demo.ClassDemo.MultiThread.MyThread;

/**
 * ClassName: TestMyThread
 * Author: Roohom
 * Function:测试多线程
 * Date: 2020/7/31 18:39
 * Software: IntelliJ IDEA
 */
public class TestMyThread {
    //main()方法也是一个线程
    public static void main(String[] args) {
        System.out.println("这是主线程...");
        MyThread mt = new MyThread("大黄...");
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("小黑" + i);
        }
    }
}
