package com.roohom.demo.ClassDemo.API.CalendarDemo;


import java.util.Calendar;

/**
 * ClassName: CalendarDemo2
 * Author: Roohom
 * Function:获取指定格式的当前日期时间
 * Date: 2020/7/25 11:14
 * Software: IntelliJ IDEA
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
        //打印年月日 格式: yyyy-MM-dd HH:mm:ss
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        //获取年月日时分秒

        //获取到日期用变量保存
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        //格式化输出
        StringBuilder sb = new StringBuilder();
        sb.append(year).append("-").append(month+1).append("-").append(day).append(" ").append(hour).append(":").append(minute).append(":").append(second);
        System.out.println(sb);
    }
}
