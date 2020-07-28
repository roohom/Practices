package com.roohom.demo.homework.day12.ListOperate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StrList
 * Author: Roohom
 * Function:
 * Date: 2020/7/28 19:40
 * Software: IntelliJ IDEA
 */
public class StrList {
    /**
     * Function: 判断字符串中是否包含数字
     * @param s 传入字符串
     * @return true代表包含 false代表不包含
     */
    public static boolean contaisNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '0' && s.charAt(i) < '9')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        System.out.println("请输入你想存入的字符串个数:");

        //存入用户自定义的字符串
        int in = new Scanner(System.in).nextInt();
        System.out.println("您输入的字符串个数是:"+in);
        for (int i = 0; i < in; i++) {
            System.out.println("请输入第"+(i+1)+"个字符串:");
            ls.add(new Scanner(System.in).next());
        }
        //装载完毕
        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            if (contaisNum(next.toString()))
                it.remove();
        }
        //打印集合
        System.out.println(ls);
    }
}
