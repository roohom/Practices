package com.roohom.demo.homework.day12.Registration;

import java.util.Scanner;

/**
 * ClassName: Regester
 * Author: Roohom
 * Function:用户注册,判断输入的手机号是否都是数字，并打印后四位
 * Date: 2020/7/28 19:25
 * Software: IntelliJ IDEA
 */
public class Register {

    /**
     * 判断字符串是不是串数字字符串
     * @param tel 输入的字符串
     * @return true代表是纯数字 false代表不是
     */
    public static boolean ifAllNum(String tel)
    {
        for (int i = 0; i < tel.length(); i++) {
            if (tel.charAt(i)>='0' && tel.charAt(i)<='9')
                return true;
        }
        return false;
    }

    //第二种方法 try...catch方法
    public static boolean ifAllNum2(String tel)
    {
        try
        {
            long num = Long.parseLong(tel);
//            return true;
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }




    public static void main(String[] args) {
        System.out.println("请输入手机号码:");
        String tel = new Scanner(System.in).next();
        if (tel.length()==11 && ifAllNum2(tel) )
        {
            System.out.println(tel.substring(7,11));
            System.out.println("隐藏后的手机号:");

            //隐藏手机号中间四位
            //1.获取到中间四位
            //2.将中间四位替换为****
            String s = tel.substring(3,7);
            String p = tel.replace(s,"****");
            System.out.println(p);
        }else
            System.out.println("注册失败");
    }
}
