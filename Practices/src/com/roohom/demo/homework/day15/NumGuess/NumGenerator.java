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
        //如果猜的不对，线程一就不需要结束
        //一开始没有数字就生成一个数字，有了数字就进行给线程二提示
        while (!n.stop )
            n.generateNum();
    }
}
