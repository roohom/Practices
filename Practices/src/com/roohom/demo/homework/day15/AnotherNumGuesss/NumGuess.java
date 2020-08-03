package com.roohom.demo.homework.day15.AnotherNumGuesss;

/**
 * ClassName: NumGuess
 * Author: Roohom
 * Function:
 * Date: 2020/8/3 11:55
 * Software: IntelliJ IDEA
 */
public class NumGuess implements Runnable {
    private int num;
    private int gsNum;
    //猜没猜数字
    private boolean guess = false;
    //给没给数字
    private boolean give = false;

    //message
    boolean stop = false;

    private int min = 1;
    private int max = 100;

    @Override
    public void run() {
        while (!stop)
            guessNumRun();
    }

    public synchronized void guessNumRun() {
        if (Thread.currentThread().getName().equals("generator") && !give) {
            //如果没有数字就生成数字
            num = (int) (Math.random() * 100) + 1;
            System.out.println("第一个线程正在设置数字...");
            System.out.println("本次设置的数字是:" + num);

            //生成数字之后，现在有数字了，修改数字状态
            give = true;
        }
        if (Thread.currentThread().getName().equals("generator")) {
            while (!guess)
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            if (num > gsNum) {
                min = gsNum + 1;
                System.out.println("猜小了");
            } else if (num < gsNum) {
                System.out.println("猜大了");
                max = gsNum - 1;
            } else {
                System.out.println("本次猜的数字是:" + gsNum);
                System.out.println("猜对啦！");
                stop = true;
            }
            guess = false;
        }

        if (Thread.currentThread().getName().equals("guesser") && give) {
            //如果猜了，等待给出提示
            while (guess) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //如果有数字，就直接猜数字
            gsNum = (int) (Math.random() * (max - min)) + min;
            System.out.println("第二个线程猜的数字是:" + gsNum);
            //猜过数字了
            guess = true;
        }
        notifyAll();
    }
}

