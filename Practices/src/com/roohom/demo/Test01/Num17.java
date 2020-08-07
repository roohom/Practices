package com.roohom.demo.Test01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * ClassName: Num17
 * Author: Roohom
 * Function:
 * Date: 2020/8/7 09:31
 * Software: IntelliJ IDEA
 */
public class Num17 {
    public static void main(String args[]) throws IOException {
        //创建长度为10的数组。
        int[] arr = new int[10];
        //创建随机数对象
        Random r = new Random();
        //创建泛型为Integer的ArrayList集合，
        // 创建键和值都是Integer的map集合，
        // 创建字符输出流，文件是根目录下的number.txt。
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("number.txt")));
        //遍历数组。
        for (int i = 0; i < arr.length; i++) {
            //为数组的每个元素赋上（1~100）的随机数。
            arr[i] = r.nextInt(100) + 1;
            //对数组中的元素判断，如果大于等于10存到List集合，如果小于10存入map集合，将这数的索引作为key,这个数作为value。
            if (arr[i] > 10)
                list.add(arr[i]);
            else
                map.put(i, arr[i]);
        }
        //判断map集合是否存在元素，如果没有元素则在控制台提示："数组中没有符合条件的元素存入map集合！"
        //如果有，则使用字符输出流将map集合中的元素（key值和value值之前用':'间隔）的写入文件，元素和元素之间一定要换行。
        if (map.size() == 0)
            System.out.println("数组中没有符合条件的元素存入map集合！");
        else {
            for (Integer integer : map.keySet()) {
                bw.write(integer+":"+map.get(integer));
                bw.newLine();
            }
        }
        //关流
        bw.close();
    }
}
