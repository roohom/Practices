package com.roohom.demo; /**
 * ClassName: com.roohom.demo.switchSeason
 * Author: Roohom
 * Function:
 * Date: 2020/7/13 17:36
 * Software: IntelliJ IDEA
 */
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class switchSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个季节:");
        int month = sc.nextInt();

        switch (month)
        {
            case 12:
                System.out.println("冬季");
                break;
            case 1:
                System.out.println("春季");
                break;
            case 2:
                System.out.println("春季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("夏季");
                break;
            case 5:
                System.out.println("夏季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("秋季");
                break;
            case 8:
                System.out.println("秋季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("冬季");
                break;
            case 11:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你见过这样的日期吗？");
                break;

        }
    }
}
