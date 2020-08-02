package com.roohom.demo.ClassDemo.MultiThread.MyThread;

/**
 * ClassName: MyThread
 * Author: Roohom
 * Function:自定义多线程类
 * Date: 2020/7/31 18:35
 * Software: IntelliJ IDEA
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    //耦合度过高
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "正在执行" + i);
        }
    }
}
