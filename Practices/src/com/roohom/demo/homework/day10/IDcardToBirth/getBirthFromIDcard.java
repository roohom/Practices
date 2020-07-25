package com.roohom.demo.homework.day10.IDcardToBirth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: getBirthFromIDcard
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 20:35
 * Software: IntelliJ IDEA
 */
public class getBirthFromIDcard {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的身份证号");
        //341125199709091273
        Scanner sc = new Scanner(System.in);
        String id_number = sc.next();
        StringBuilder sb = new StringBuilder(id_number);
        int str_birth1 = Integer.parseInt(sb.substring(6,10));
        int str_birth2 = Integer.parseInt(sb.substring(10,12));
        int str_birth3 =Integer.parseInt(sb.substring(12,14));
        String str_birth = str_birth1+"年"+ str_birth2+"月"+ str_birth3+"日";
        System.out.println(str_birth);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date strDate = sdf.parse(str_birth);
        System.out.println(sdf.format(strDate));
    }
}
