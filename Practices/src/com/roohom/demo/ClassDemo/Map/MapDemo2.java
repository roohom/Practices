package com.roohom.demo.ClassDemo.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: MapDemo2
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 16:13
 * Software: IntelliJ IDEA
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1","01");
        map.put("2","02");
        map.put("3","03");

        map.put("1","001");
        System.out.println(map);

        if (map.containsKey("3"))
            map.remove("3");
        System.out.println(map);
        //map.clear();
        //System.out.println(map);

        System.out.println("键2对应的值为:"+map.get("2"));
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
