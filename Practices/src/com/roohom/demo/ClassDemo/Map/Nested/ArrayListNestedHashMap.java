package com.roohom.demo.ClassDemo.Map.Nested;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * ClassName: ArrayListNestedHashMap
 * Author: Roohom
 * Function:ArrayList嵌套HashMap
 * Date: 2020/7/28 09:57
 * Software: IntelliJ IDEA
 */
public class ArrayListNestedHashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> list = new ArrayList<>();

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1","01");
        map1.put("2","02");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("01","03");
        map2.put("02","04");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("001","05");
        map3.put("002","06");

        //把map装入进List
        list.add(map1);
        list.add(map2);
        list.add(map3);

        //遍历
        //遍历list
        for (HashMap<String, String> map : list) {
            //遍历map
            for (String s : map.keySet()) {
                System.out.println(s+"->"+map.get(s));
            }
        }
    }
}
