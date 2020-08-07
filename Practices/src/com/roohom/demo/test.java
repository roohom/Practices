package com.roohom.demo;

import java.util.*;

/**
 * ClassName: test
 * Author: Roohom
 * Function:
 * Date: 2020/7/29 00:27
 * Software: IntelliJ IDEA
 */

public class test {
    public static void main(String args[]) {
        String str = "sisbcshdqkasx2t2343ti0frdbsau";

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (countMap.get(str.charAt(i))==null)
                countMap.put(str.charAt(i),1);
            else
                countMap.put(str.charAt(i),countMap.get(str.charAt(i))+1);
        }
        //遍历Map EntrtSet方式
//        Set<Map.Entry<Character, Integer>> entries = countMap.entrySet();
//        for (Map.Entry<Character, Integer> entry : entries) {
//            System.out.println(entry);
//        }

        //keyset方式
//        Set<Character> set = countMap.keySet();
//        for (Character character : set) {
//            System.out.println(character+","+countMap.get(character));
//        }


        //System.out.println(countMap);

    }
}