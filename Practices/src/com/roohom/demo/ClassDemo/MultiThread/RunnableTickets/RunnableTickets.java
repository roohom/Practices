package com.roohom.demo.ClassDemo.MultiThread.RunnableTickets;

/**
 * ClassName: RunnableTickets
 * Author: Roohom
 * Function:实现Runnable接口的卖票类
 * Date: 2020/8/2 11:21
 * Software: IntelliJ IDEA
 */
public class RunnableTickets implements Runnable {

    int num = 100; //总票数100张
    Object lock = new Object();

    @Override
    public void run() {
        while (true) { //模拟一直在卖票
            synchronized (lock) {
                if (num <= 0)
                    break;
                System.out.println(Thread.currentThread().getName() + "卖出第" + (num--) + "张票");
            }
        }
    }
}
