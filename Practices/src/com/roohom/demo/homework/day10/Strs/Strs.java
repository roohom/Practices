package com.roohom.demo.homework.day10.Strs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Strs
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 21:24
 * Software: IntelliJ IDEA
 */
public class Strs {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("efg");
        ls.add("def");
        ls.add("def");
        ls.add("qwe");
        ls.add("def");
        ls.add("def");
        ls.add("swd");
        ls.add("wwe");
        ls.add("def");
        ls.add("def");

        //打印索引为3的元素
        for (int i = 0; i <ls.size() ; i++) {
            if (i==3)
                System.out.println(ls.get(i));
        }

        //包含def
        int count=0;
        for (int i = 0; i < ls.size(); i++) {
            if (myContains(ls.subList(i,i+1),"def"))
                count++;
        }
        //如果只想统计def，却不使用myContains，可以使用enhanced for
        int c = 0;
        for (String s: ls) {
            if(s.equals("def"))
                c++;
        }
        System.out.println("集合中有"+count+"个def");


        //删除集合中所有的“def”
        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            if (next.contains("def"))
                it.remove();
        }
        System.out.println(ls);

        for (int i = 0; i < ls.size(); i++) {
            ls.set(i,ls.get(i).toUpperCase());
        }
        System.out.println(ls);

        //将集合转换成String类型并打印
        String[] arr = new String[ls.size()];
        ls.toArray(arr);
        for (String l : arr) {
            System.out.print(l + " ");
        }
        //另一种，遍历集合把集合中每一个元素存储到一个新的String[]数组中
    }

    public static boolean myContains(List list, String str)
    {
        if (list.contains(str))
            return true;
        return false;
    }
}
