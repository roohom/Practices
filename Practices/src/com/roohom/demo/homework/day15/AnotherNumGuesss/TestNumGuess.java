package com.roohom.demo.homework.day15.AnotherNumGuesss;

/**
 * ClassName: TestNumGuess
 * Author: Roohom
 * Function:
 * Date: 2020/8/3 11:58
 * Software: IntelliJ IDEA
 */
public class TestNumGuess {
    public static void main(String[] args) {
        NumGuess ng = new NumGuess();

        Thread t1 = new Thread(ng,"generator");
        Thread t2 = new Thread(ng,"guesser");

        t1.start();
        t2.start();

    }
}
