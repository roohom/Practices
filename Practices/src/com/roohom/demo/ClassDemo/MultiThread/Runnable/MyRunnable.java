package com.roohom.demo.ClassDemo.MultiThread.Runnable;

/**
 * ClassName: MyRunnable
 * Author: Roohom
 * Function:自定义
 * Date: 2020/7/31 18:53
 * Software: IntelliJ IDEA
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
