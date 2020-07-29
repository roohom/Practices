package com.Tuling.demo.Pratices;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: TestGuess
 * Author: Roohom
 * Function:
 * Date: 2020/7/14 20:49
 * Software: IntelliJ IDEA
 */
public class TestGuess {
    public static void main(String[] args) {
        //随机生成数字
        System.out.println("我已经随机生成了一个1~100之间的随机数，你可以来猜一猜:");
        Random rd = new Random();
        int num = rd.nextInt(100)+1;
        System.out.println(num);

        for (;;)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n == num)
            {
                System.out.println("猜对了！");
                break;
            }
            else
            {
                System.out.println("猜错了！");
            }
        }

    }
}
