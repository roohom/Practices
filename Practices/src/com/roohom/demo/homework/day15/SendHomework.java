package com.roohom.demo.homework.day15;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: SendHomework
 * Author: Roohom
 * Function:模拟三位老师共同下发100份作业
 * Date: 2020/8/2 18:57
 * Software: IntelliJ IDEA
 */

class Teacher implements Runnable {

    private int homework = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();
                if (homework > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在派发第" + homework + "份作业...");
                    homework--;
                } else
                    break;
            } finally {
                lock.unlock();
            }
        }
    }
}

public class SendHomework {
    public static void main(String[] args) {
        Teacher tea = new Teacher();

        Thread t1 = new Thread(tea, "大哈老师");
        Thread t2 = new Thread(tea, "小嚯老师");
        Thread t3 = new Thread(tea, "中嘿老师");

        System.out.println("一大波作业即将来袭...");
        t1.start();
        t2.start();
        t3.start();
    }
}

