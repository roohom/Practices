package com.roohom.demo.ClassDemo.MultiThread.RunnableTickets;

/**
 * ClassName: TestTcikets
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 11:24
 * Software: IntelliJ IDEA
 */
public class TestTcikets {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        //创建三个卖票的窗口
        RunnableTickets ticket = new RunnableTickets();

        Thread t1= new Thread(ticket,"窗口1");
        Thread t2= new Thread(ticket,"窗口2");
        Thread t3= new Thread(ticket,"窗口3");

        t1.start();
        t2.start();
        t3.start();

        long end = System.currentTimeMillis();
        System.out.println("本次执行时间是:"+(end - start)+"毫秒");

        //使用线程锁实现同步机制之后执行使用了2毫秒
    }
}
