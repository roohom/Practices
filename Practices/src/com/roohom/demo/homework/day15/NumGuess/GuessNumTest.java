package com.roohom.demo.homework.day15.NumGuess;

/**
 * ClassName: GuessNumTest
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 20:47
 * Software: IntelliJ IDEA
 */
public class GuessNumTest {
    public static void main(String[] args) {
        //公用的资源类，里面有共享的变量，类似于生产者和消费者共用的资源，
        NumGuess n = new NumGuess();
        //将资源作为参数传入数字生成者和猜数者
        NumGenerator gen = new NumGenerator(n);
        NumGuesser gue = new NumGuesser(n);

        //实例化两个线程，启动两个线程
        Thread t1 = new Thread(gen,"generator");
        Thread t2 = new Thread(gue,"guesser");
        t1.start();
        t2.start();
    }
}
