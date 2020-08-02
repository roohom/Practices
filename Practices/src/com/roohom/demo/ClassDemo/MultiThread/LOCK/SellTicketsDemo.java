package com.roohom.demo.ClassDemo.MultiThread.LOCK;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: SellTicketsDemo
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 18:24
 * Software: IntelliJ IDEA
 */
class SellTicket implements Runnable{
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true)
        {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售出第" + tickets + "张票");
                    tickets--;
                }
                else
                    break;
            }
            finally {
                lock.unlock();
            }
        }
    }
}
public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
