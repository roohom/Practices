package com.roohom.demo.homework.day15.NumGuess;

/**
 * ClassName: NumGuess
 * Author: Roohom
 * Function:两个线程猜数字游戏
 * Request: * 用两个线程玩猜数字游戏，第一个线程负责随机给出1~100之间的一个整数，第二个线程负责猜出这个数。
 *          * 要求每当第二个线程给出自己的猜测后，第一个线程都会提示“猜小了”、“猜大了”或“猜对了”。 猜数之前，要求第二个线程要等待第一个线程设置好要猜测的数。
 *          * 第一个线程设置好猜测数之后，两个线程还要相互等待。
 *          * 其原则是：第二个线程给出自己的猜测后，等待第一个线程给出的提示；第一个线程给出提示后，等待给第二个线程给出猜测。
 *          * 如此进行，直到第二个线程给出正确的猜测后，两个线程进入死亡状态
 * Date: 2020/8/2 20:10
 * Software: IntelliJ IDEA
 */
public class NumGuess {
    //线程一随机生成的让线程二猜的数字
    private int num;
    //线程二随机生成的猜的数字
    private int gsNum;
    //猜没猜数字
    private boolean guess = false;
    //给没给数字
    private boolean give = false;
    //记录开关状态，用于停止程序
    boolean stop = false;
    //用来记录猜数字的区间，为了将猜数字的范围缩小
    private int min = 1;
    private int max = 100;
    //用来计数猜了多少次的计数器
    int count = 1;

    public synchronized void generateNum() {
        //如果当前执行的线程是生成数者，也就是第一个线程，并且还没有给出一个数字让第二个线程来猜，那么就需要生成一个数字
        if (!give) {
            //如果没有数字就生成数字
            num = (int) (Math.random() * 100) + 1;
            System.out.println("第一个线程正在设置数字...");
            System.out.println("本次设置的数字是:" + num);

            //生成数字之后，现在有数字了，修改数字状态为true
            give = true;
        }
        //如果没猜，就等着第二个线程来猜数字
        while (!guess) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (num > gsNum) {
            min = gsNum + 1;
            System.out.println("第1个线程回答:猜小了");
        } else if (num < gsNum) {
            System.out.println("第1个线程回答:猜大了");
            max = gsNum - 1;
        } else {
            System.out.println("第1个线程回答:你猜的数字是" + gsNum);
            System.out.println("猜对啦！");
            //猜对了程序就可以停下来了，将stop置为true
            stop = true;
            //return;
        }
        //没猜，或者猜的都不对，就相当于没猜，那么将guess置为false
        guess = false;
        //通知第二个线程，现在可以来猜了，也就是唤醒第二个线程
        notifyAll();
    }

    public synchronized void guessNum() {
        //如果第二个线程猜了，等待线程一给出提示
        while (guess) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果猜的不对，程序就不需要停止，线程二还需要继续猜，也就是再生成一个数
        if (!stop) {
            gsNum = (int) (Math.random() * (max - min)) + min;
            System.out.println("第2个线程第" + (count++) + "次猜的数字是:" + gsNum);
            //猜过数字了
            guess = true;
        }
        //通知线程一线程二猜过了，可以进行判断了，也就是唤醒等待中的线程一
        notifyAll();
    }
}
