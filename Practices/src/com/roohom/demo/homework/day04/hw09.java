package com.roohom.demo.homework.day04;

import java.util.Scanner;

/**
 * ClassName: hw09
 * Author: Roohom
 * Function:
 * 猜字母游戏（参考课堂上猜数字案例）
 * - 随机获取任意一个26个英文小写字母
 * - 用户输入小写字母
 * - 如果输入的字母大于随机字母，则提示：太大了! （继续让用户猜）
 * - 如果输入的字母小于随机字母，则提示：太小了!  （继续让用户猜）
 * - 如果输入的字母和随机字母相同，则提示：恭喜您，猜对了! （游戏结束）
 *   提示：（随机字母）
 *   1. 使用数组存储26个英文小写字母
 *   2. 通过随机数，获取0~26之间(不包含26)的随机数字
 *
 *
 * Date: 2020/7/16 20:00
 * Software: IntelliJ IDEA
 */
public class hw09 {
    public static void main(String[] args) {
        //a 是97
        //z 是122
        char num = (char)(Math.random()*0.26*100+97);
        while (true)
        {
            System.out.println("请输入一个字母:");
            Scanner sc = new Scanner(System.in);
            char input =sc.next().charAt(0);
            char a = input;
            if (a>num)
            {
                System.out.println("太大了！");
            }else if (a<num)
            {
                System.out.println("太小了！");
            }else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
