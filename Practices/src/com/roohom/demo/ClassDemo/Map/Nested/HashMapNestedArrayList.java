package com.roohom.demo.ClassDemo.Map.Nested;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: HashMapNestedArrayList
 * Author: Roohom
 * Function:Map嵌套List
 * Date: 2020/7/28 10:01
 * Software: IntelliJ IDEA
 */
public class HashMapNestedArrayList {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("01");
        list1.add("02");

        List<String> list2 = new ArrayList<>();
        list2.add("001");
        list2.add("002");

        List<String> list3 = new ArrayList<>();
        list3.add("0001");
        list3.add("0002");

        map.put("1",list1);
        map.put("2",list2);
        map.put("3",list3);

        //遍历Map
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            //遍历list
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
}
