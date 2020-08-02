package com.roohom.demo.ClassDemo.MultiThread.ThreadContrl;

/**
 * ClassName: ThreadSleep
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 18:07
 * Software: IntelliJ IDEA
 */
class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+ ": "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();


        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");


        ts1.start();
        ts2.start();
        ts3.start();

    }
}
