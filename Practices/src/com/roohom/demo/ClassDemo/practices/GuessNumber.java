package com.roohom.demo.ClassDemo.practices;

import java.util.Scanner;

/**
 * ClassName: GuessNumber
 * Author: Roohom
 * Function:
 * Date: 2020/7/15 17:59
 * Software: IntelliJ IDEA
 */

/*
需求
        1.	 生成一个1-100之间的随机数, 让用户来猜
        2.	 如果猜的数字比生成的随机数大，提示你猜的数据大了
        3.	 如果猜的数字比生成的随机数小，提示你猜的数据小了
        4.	 如果猜的数字与生成的随机数相等，提示恭喜你猜中了
*/

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("我将生成一个1~100之间的随机数，你可以来猜一猜:");
        int rdm = (int)(Math.random()*100+1);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true)
        {
            int num = sc.nextInt();
            count++;
            if (num<rdm)
            {
                System.out.println("你猜的数小了，再猜一猜！");
            }
            else if (num>rdm)
            {
                System.out.println("你猜的数大了，再猜一猜！");
            }
            else {
                System.out.println("你猜对了！你咋恁聪明呢！");
                if (count>8)
                {
                    System.out.println("猜到现在才猜出来，其实你是不咋聪明地哟~");
                }
                break;
            }
        }
    }

}
