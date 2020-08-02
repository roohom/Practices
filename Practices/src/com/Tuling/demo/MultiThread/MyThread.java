package com.Tuling.demo.MultiThread;

/**
 * ClassName: MyThread
 * Author: Roohom
 * Function:自定义MyThread类
 * Date: 2020/8/1 21:22
 * Software: IntelliJ IDEA
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
//        System.out.println("你好，多线程");
        //一般来说，被线程指定的代码一定非常耗时
        for (int i = 0; i < 10; i++) {
            System.out.println("你好，"+i);
        }
    }
}
