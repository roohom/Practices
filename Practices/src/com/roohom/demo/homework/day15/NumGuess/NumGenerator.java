package com.roohom.demo.homework.day15.NumGuess;

/**
 * ClassName: NumGenerator
 * Author: Roohom
 * Function:
 * Date: 2020/8/2 20:44
 * Software: IntelliJ IDEA
 */
public class NumGenerator implements Runnable{

    private NumGuess n;

    public NumGenerator(NumGuess n) {
        this.n = n;
    }

    @Override
    public void run() {
        n.generateNum();
    }
}
