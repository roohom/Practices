package com.roohom.demo.ClassDemo.MultiThread;

/**
 * ClassName: DeadLock
 * Author: Roohom
 * Function:死锁演示
 * Date: 2020/8/2 14:54
 * Software: IntelliJ IDEA
 */

class ThreadDeadLock1 implements Runnable {

    final Object lockA;
    final Object lockB;

    public ThreadDeadLock1(Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        //嵌套的同步代码块
        while (true) {
            synchronized (lockA) {
                System.out.println(Thread.currentThread().getName() + "获取了LOCKA锁");
                synchronized (lockB) {
                    System.out.println(Thread.currentThread().getName() + "获取LockA锁又获取了LOCKB锁");
                }
            }
        }
    }
}

class ThreadDeadLock2 implements Runnable {

    final Object lockA;
    final Object lockB;

    public ThreadDeadLock2(Object lockA, Object lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        //嵌套的同步代码块
        while (true) {
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "获取了LOCKB锁");
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName() + "获取LockB锁又获取了LOCKA锁");
                }
            }
        }
    }
}


public class DeadLock {
    //在程序中有两个及以上的同步锁，嵌套synchronized代码块
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();

        ThreadDeadLock1 th1 = new ThreadDeadLock1(lockA, lockB);
        ThreadDeadLock2 th2 = new ThreadDeadLock2(lockA, lockB);

        new Thread(th1).start();
        new Thread(th2).start();
    }
}
