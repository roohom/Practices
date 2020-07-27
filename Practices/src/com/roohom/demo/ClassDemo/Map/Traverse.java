package com.roohom.demo.ClassDemo.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Traverse
 * Author: Roohom
 * Function:Map的遍历
 * Date: 2020/7/27 16:28
 * Software: IntelliJ IDEA
 */
public class Traverse {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("1","01");
        map.put("2","02");
        map.put("3","03");

        //keyset
        Set<String> keys = map.keySet();
        //迭代器遍历
        for (String key : keys) {
            //利用key获取集合中的value
            System.out.println("Key:"+key+",value:"+map.get(key));
        }
        System.out.println("=========================");

        //Map.Entry遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历Set集合即可
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key:"+key+",value:"+value);
        }

//        System.out.println("++++++++++++++++++++++++++");
//        for (Map.Entry<String,String> entry:map.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Key:"+key+",value:"+value);
//        }
    }
}
