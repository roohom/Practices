package com.roohom.demo.ClassDemo.API.CalendarDemo;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.util.Calendar;

/**
 * ClassName: CalendarDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 11:09
 * Software: IntelliJ IDEA
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.YEAR);


        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);//月份 0~11
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//当月中的天


    }
}
