package com.roohom.demo.homework.day15.NumGuess;

/**
 * ClassName: NumGuesser
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 20:46
 * Software: IntelliJ IDEA
 */
public class NumGuesser implements Runnable{

    private NumGuess n;

    public NumGuesser(NumGuess n) {
        this.n = n;
    }

    @Override
    public void run() {
        n.guessNum();
    }
}
