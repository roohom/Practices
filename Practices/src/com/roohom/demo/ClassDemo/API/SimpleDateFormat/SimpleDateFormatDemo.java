package com.roohom.demo.ClassDemo.API.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: SimpleDateFormat
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 10:08
 * Software: IntelliJ IDEA
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("格式化操作:");
        Date  date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String strDate = sdf.format(date);
        System.out.println(strDate);

        System.out.println("===============================");
        System.out.println("解析操作:");
        String s = "2020年7月15日 23:54:54";
        SimpleDateFormat newSdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = newSdf.parse(s);

        System.out.println(date1);

    }
}
