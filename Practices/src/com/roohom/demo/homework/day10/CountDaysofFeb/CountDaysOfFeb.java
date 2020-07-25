package com.roohom.demo.homework.day10.CountDaysofFeb;

import java.util.Calendar;
import java.util.Scanner;

/**
 * ClassName: CountDaysOfFeb
 * Author: Roohom
 * Function:计算某一年二月有多少天
 * Date: 2020/7/25 18:55
 * Software: IntelliJ IDEA
 */
public class CountDaysOfFeb {
    public static void main(String[] args) {
        //提示用户输入:
        System.out.println("请输入你想设置的年份，我将为您获取该年二月的天数:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //创建calendar对象
        Calendar calendar = Calendar.getInstance();
        //将日期设置为该年的3月1日
        calendar.set(year,2,1);//注意:月份区间是0~11，所以想获取三月，就得使用传参2
        //将日期减1得到二月的最后一天
        calendar.add(calendar.DATE,-1);
        //获取当前的日期是二月的第多少天
        System.out.println(year+"年2月共有:"+calendar.get(Calendar.DAY_OF_MONTH)+"天");
    }
}
