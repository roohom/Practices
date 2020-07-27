package com.roohom.demo.homework.day11.StrMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: StrMap
 * Author: Roohom
 * Function:统计一个字符串中每个字符的出现次数
 * Date: 2020/7/27 19:10
 * Software: IntelliJ IDEA
 */
public class StrMap {
    public static void main(String[] args) {
        //先定义一个字符串
        String str = "111aaaBBBcdeBBBbbfgHHHIII111jk";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), getCount(str, str.charAt(i)));
        }

        Set<Character> chars = map.keySet();
        for (Character aChar : chars) {
            System.out.println("Key:" + aChar + ",Value:" + map.get(aChar));
        }
    }

    /**
     * Function:获取指定字符在字符串中出现的次数
     * @param str   源字符串
     * @param aChar 指定字符
     * @return 出现次数
     */
    public static int getCount(String str, char aChar) {
        int ct = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == aChar)
                ct++;
        }
        return ct;
    }
}
