package com.roohom.demo.ClassDemo.MultiThread.ThreadPriority;

/**
 * ClassName: ThreadPriorit
 * Author: Roohom
 * Function:进程优先级
 * Date: 2020/8/2 18:01
 * Software: IntelliJ IDEA
 */
public class ThreadPriority extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
