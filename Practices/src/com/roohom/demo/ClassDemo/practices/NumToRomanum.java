package com.roohom.demo.ClassDemo.practices;

import java.util.Scanner;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:将输入的阿拉伯数字(1~3999之间)转换成罗马数字输出
 * 对应于LeetCode第12题
 * Date: 2020/7/27 19:58
 * Software: IntelliJ IDEA
 */
public class NumToRomanum {

    //    字符          数值
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    // 58 LVIII

//        if (num == 4)
//            return "IV";
//        if (num == 9)
//            return "IX";
//        if (num == 40)
//            return "XL";
//        if (num == 90)
//            return "XC";
//        if (num == 400)
//            return "CD";
//        if (num == 900)
//            return "CM";

    /**
     * Function:将输入的阿拉伯数字(1~3999之间)转换成罗马数字输出
     * @param num 输入的阿拉伯数字
     * @return 罗马数字
     */
    public static String getRomaNum(int num) {
        StringBuilder romaNum = new StringBuilder();
        int qian = num / 1000;
        int bai = num / 100 % 10;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println("qian:" + qian + " bai:" + bai + " shi:" + shi + " ge:" + ge);
        if (qian >= 0) {
            if (qian==9)
            {

            }
            for (int i = 0; i < qian; i++) {
                romaNum.append("M");
            }
            if (bai >= 0) {
                if (bai == 9) {
                    romaNum.append("CM");
                } else if (bai == 4) {
                    romaNum.append("CD");
                }
                else if (bai>=5)
                {
                    romaNum.append("D");
                    for (int i = 0; i < bai-5; i++) {
                        romaNum.append("C");
                    }
                }
                else
                    {
                    for (int i = 0; i < bai; i++) {
                        romaNum.append("C");
                    }
                }
                if (shi >= 0) {
                    if (shi == 9)
                        romaNum.append("XC");
                    else if (shi == 4)
                        romaNum.append("XL");
                    else if (shi >= 5) {
                        romaNum.append("L");
                        for (int i = 0; i < shi-5; i++) {
                            romaNum.append("X");
                        }
                    }
                    else {
                        for (int i = 0; i < shi; i++) {
                            romaNum.append("X");
                        }
                    }
                }
                if (ge >= 0) {
                    if (ge == 9)
                        romaNum.append("IX");
                    else if (ge==5)
                        romaNum.append("V");
                    else if (ge == 4)
                        romaNum.append("IV");
                    else if (ge<=3){
                        for (int i = 0; i < ge; i++) {
                            romaNum.append("I");
                        }
                    }
                    else {
                        romaNum.append("V");
                        for (int i = 0; i < ge-5; i++) {
                            romaNum.append("I");
                        }
                    }
                }
            }
        }
        return romaNum.toString();
    }


    public static void main(String[] args) {
        System.out.println(getRomaNum(new Scanner(System.in).nextInt()));
    }
}