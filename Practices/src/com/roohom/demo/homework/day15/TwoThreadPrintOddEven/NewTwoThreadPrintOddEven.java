package com.roohom.demo.homework.day15.TwoThreadPrintOddEven;

import sun.awt.windows.WPrinterJob;

/**
 * ClassName: NewTwoThreadPrintOddEven
 * Author: Roohom
 * Function:两个线程交替打印奇数和偶数
 * Date: 2020/8/4 19:42
 * Software: IntelliJ IDEA
 */
public class NewTwoThreadPrintOddEven {

    public synchronized static void printOddEven(int num) {
        try {
            NewTwoThreadPrintOddEven.class.notify();
            System.out.println(Thread.currentThread().getName() + " : " + num);
            NewTwoThreadPrintOddEven.class.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0)
                        printOddEven(i);
                    if (i == 98)
                        break;
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i > 0; i--) {
                    if (i % 2 != 0)
                        printOddEven(i);
                    if (i == 1)
                        break;
                }
            }
        });
        t2.start();
    }
}
