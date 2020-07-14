package com.Tuling.demo;

/**
 * ClassName: TestDoWhile
 * Author: Roohom
 * Function:do while 循环练习
 * Date: 2020/7/14 21:12
 * Software: IntelliJ IDEA
 */
public class TestDoWhile {
    public static void main(String[] args) {
        //使用while循环打印1-10
        int i = 10;
        while(i>=1)
        {
            System.out.println(i);
            i--;
        }
        i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);

    }
}

