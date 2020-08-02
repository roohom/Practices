package com.roohom.demo.ClassDemo.MultiThread.ThreadContrl;

/**
 * ClassName: ThreadDaemon
 * Author: Roohom
 * Function:守护进程
 * Date: 2020/8/2 18:17
 * Software: IntelliJ IDEA
 */
class ThreadDaemon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+ ": "+ i);
        }
    }
}


public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("嘿嘿");
        td2.setName("哈哈");

        Thread.currentThread().setName("嚯嚯");

        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
