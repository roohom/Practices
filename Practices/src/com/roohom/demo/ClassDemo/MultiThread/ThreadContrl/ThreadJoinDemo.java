package com.roohom.demo.ClassDemo.MultiThread.ThreadContrl;

/**
 * ClassName: ThreadJoinDemo
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 18:12
 * Software: IntelliJ IDEA
 */
class ThreadJoin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}


public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();


        tj1.setName("大哈");
        tj2.setName("小嚯");
        tj3.setName("中嘿");

        tj1.start();

        //等等tj1线程的执行直至死亡
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
