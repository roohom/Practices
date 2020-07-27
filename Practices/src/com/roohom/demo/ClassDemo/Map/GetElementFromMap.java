package com.roohom.demo.ClassDemo.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: GetElementFromMap
 * Author: Roohom
 * Function:从map获取元素
 * Date: 2020/7/27 18:00
 * Software: IntelliJ IDEA
 */
public class GetElementFromMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","01");
        map.put("2","02");
        map.put("3","03");

        Set<String> ms = map.keySet();
        for (String m : ms) {
            //获取所有的键
            System.out.println(m);
            System.out.println("键为:"+m+",值为:"+map.get(m));
        }
        System.out.println("============================");
        Collection<String> values = map.values();
        for (String value : values) {
            //获取所有的值
            System.out.println(value);
        }
    }
}
