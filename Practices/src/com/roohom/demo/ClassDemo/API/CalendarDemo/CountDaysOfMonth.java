package com.roohom.demo.ClassDemo.API.CalendarDemo;


import com.roohom.demo.ClassDemo.OOP.Polymorphism.ClassicCase.C;

import java.util.Calendar;

/**
 * ClassName: CountDaysOfMonth
 * Author: Roohom
 * Function:统计一个月中有多少天
 * Date: 2020/7/25 11:22
 * Software: IntelliJ IDEA
 */
public class CountDaysOfMonth {
    public static void main(String[] args) {
        //穿件日历对象
        Calendar calendar = Calendar.getInstance();
        //设置日历类中的年月日
        calendar.set(2020,2,1);
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        System.out.println("=============================");
        //对日历类中日期减1
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));


    }
}
