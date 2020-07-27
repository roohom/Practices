package com.roohom.demo.ClassDemo.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: MapDemo
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 16:05
 * Software: IntelliJ IDEA
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","马大哈");
        map.put("001","驴大哈");//不报错，会覆盖
        map.put("002","骡大哈");
        System.out.println(map);
    }
}
