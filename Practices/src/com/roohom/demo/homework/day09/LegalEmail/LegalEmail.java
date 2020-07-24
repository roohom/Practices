package com.roohom.demo.homework.day09.LegalEmail;

/**
 * ClassName: LegalEmail
 * Author: Roohom
 * Function:判断邮箱合法
 * Date: 2020/7/24 19:04
 * Software: IntelliJ IDEA
 */
public class LegalEmail {

    public static boolean leagalEmail(String str)
    {
        if (str.indexOf("@")>=0 && str.indexOf(".")>=0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String email = "roohom@qq.com";
        String email2 = "aaaavbbbbb.com";
        System.out.println(leagalEmail(email));
        System.out.println(leagalEmail(email2));
    }
}
