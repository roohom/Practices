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
        NumGuess n = new NumGuess();

        NumGenerator gen = new NumGenerator(n);
        NumGuesser gue = new NumGuesser(n);

        Thread t1 = new Thread(gen);
        Thread t2 = new Thread(gue);

        t1.start();
        t2.start();
    }
}
