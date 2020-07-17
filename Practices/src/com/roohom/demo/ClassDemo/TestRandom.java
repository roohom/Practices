package com.roohom.demo.ClassDemo;

import java.util.Random;

/**
 * ClassName: TestRandom
 * Author: Roohom
 * Function:
 * Date: 2020/7/14 20:45
 * Software: IntelliJ IDEA
 */
public class TestRandom {
    public static void main(String[] args) {
        //生成随机数
        Random rdm = new Random();

        int num = rdm.nextInt(100)+1;
        System.out.println("生成的随机数是:"+num);
    }

}
