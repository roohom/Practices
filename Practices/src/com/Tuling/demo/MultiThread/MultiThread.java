package com.Tuling.demo.MultiThread;

/**
 * ClassName: MultiThread
 * Author: Roohom
 * Function:多线程demo
 * Date: 2020/8/1 21:19
 * Software: IntelliJ IDEA
 */


/*
步骤:
1. 自定义Mythread类继承Thread类
2. MyThread重写run方法
3. 创建对象
4. 启动线程

 */
public class MultiThread {
    public static void main(String[] args) {
        //创建线程对象
        MyThread mt = new MyThread();
        MyThread my = new MyThread();
        //启动线程
        mt.run();
        my.run();
        System.out.println("=============================");
        //如果直接调用run其实就是单纯地调用run方法，效果还是单线程的效果
        mt.start();
        my.start();
    }
}
