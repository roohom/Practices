package com.roohom.demo.ClassDemo.Map.Poker;

import java.util.*;

/**
 * ClassName: PlayPokes
 * Author: Roohom
 * Function:打牌
 * Date: 2020/7/28 11:55
 * Software: IntelliJ IDEA
 */
public class PlayPokes {
    public static void main(String[] args) {
        Map<Integer,String> pokerMap = new HashMap<>();
        List<Integer> SNlist = new ArrayList<>();

        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //把牌存到map里
        int num=0;
        for (String color : colors) {
            for (String number : numbers) {
                pokerMap.put(num, color + number);
                SNlist.add(num);
                num++;
            }
        }
        Collections.shuffle(SNlist);
        System.out.println(SNlist);
        for (Integer integer : SNlist) {
            System.out.print(pokerMap.get(integer) + " ");
        }

        //发牌
        Map<Integer,String> players = new HashMap<>();
    }
}
