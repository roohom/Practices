package com.roohom.demo.homework.day12.Registration;

import java.util.Scanner;

/**
 * ClassName: Regester
 * Author: Roohom
 * Function:用户注册
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

    public static void main(String[] args) {
        System.out.println("请输入手机号码:");
        String tel = new Scanner(System.in).next();
        if (tel.length()==11 && ifAllNum(tel) )
        {
            System.out.println(tel.substring(7,11));
        }else
            System.out.println("注册失败");
    }
}
