package com.roohom.demo;

/**
 * ClassName: test
 * Author: Roohom
 * Function:
 * Date: 2020/7/29 00:27
 * Software: IntelliJ IDEA
 */

import java.util.Random;

/**
 * 用两个线程玩猜数字游戏，第一个线程负责随机给出1~100之间的一个整数，第二个线程负责猜出这个数。
 * 要求每当第二个线程给出自己的猜测后，第一个线程都会提示“猜小了”、“猜大了”或“猜对了”。 猜数之前，要求第二个线程要等待第一个线程设置好要猜测的数。
 * 第一个线程设置好猜测数之后，两个线程还要相互等待。
 * 其原则是：第二个线程给出自己的猜测后，等待第一个线程给出的提示；第一个线程给出提示后，等待给第二个线程给出猜测。
 * 如此进行，直到第二个线程给出正确的猜测后，两个线程进入死亡状态。
 *
 *
 */

public class test {
    public static void main(String args[]) {
        GameGroup game = new GameGroup();
        new Thread(game,"giveNumberThread").start();    //实例化两个线程，并命名
        new Thread(game,"guessNumberThread").start();

    }
}

class GameGroup implements Runnable {     //两个人在一个游戏里
    int realNumber, guessNumber, min = 1, max = 100, message = 0;   //message用来标志是否猜中
    boolean guess = false, give = false;	  //guess如果为false代表还没有猜，true代表已经猜完；give为false代表还没给出答案，true代表已经给出

    public void run() {
        for (int count = 1; true; count++) {
            startGame(count);     //开始每一回合的游戏
            if (message == 1)
                return;
        }
    }

    public synchronized void startGame(int count) {
        if (Thread.currentThread().getName() .equals("giveNumberThread") && give == false) { // 当前运行的线程为给出答案的线程，并且没有生成正确答案，进入if（只会进入一次）
            realNumber = (int) (Math.random() * 100) + 1;     //(Math.random()*a)+b;  表示的是生成的随机数范围为b到a+b-1
            System.out.println("随机给你一个1至100之间的数，猜猜是多少？");
            give = true;    //已生成一个随机数作为正确答案
        }
        if (Thread.currentThread().getName() .equals( "giveNumberThread")) {   //如果是给出数字的线程，则进来判断所猜数字是否正确
            while (!guess)   //如果还没猜
                try {
                    wait(); // 让出CPU使用权，让另一个线程猜数字
                } catch (InterruptedException e) {}

            if (realNumber > guessNumber) {
                min = guessNumber+1;
                System.out.println("你猜小了！");
            } else if (realNumber < guessNumber) {
                max = guessNumber-1;
                System.out.println("你猜大了！");
            } else {
                message = 1;
                System.out.println("恭喜，你猜对了！");
                return;   //退出这个方法
            }
            guess = false;   //已经判断完，需要重新猜
        }
        if (Thread.currentThread().getName() .equals( "guessNumberThread") && give == true) {  //如果是猜数字线程并且已经有正确答案
            while (guess)    //如果已经猜了数字
                try {
                    wait(); // 让出CPU使用权，让另一个线程判断
                } catch (InterruptedException e) {
                }
            guessNumber = (int) (Math.random() * (max + 1 - min)) + min;
            System.out.println("我第" + count + "次猜这个数是" + guessNumber);
            guess = true;
        }
        notifyAll();   //唤醒所有线程
    }
}
