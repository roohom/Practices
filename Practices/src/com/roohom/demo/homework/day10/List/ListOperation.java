package com.roohom.demo.homework.day10.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName: ListOperation
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 20:58
 * Software: IntelliJ IDEA
 */
public class ListOperation {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("efg");
        list.add("ck");
        list.add("Ck");
        list.add("qwe");
        list.add("swd");
        list.add("wwe");
        list.add("def");

        //遍历集合，删除所有的def和包含大小写字母c的元素
        //list.removeIf(next -> next.equals("def") || next.contains("c") || next.contains("C"));
        //使用元素.contains('c')
        //使用元素.contains('C')>=0
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            if (next.equals("def") || next.contains("c")||next.contains("C"))
                //if(next.indexOf('C')>=0||next.indexOf('c')>=0)
                it.remove();
        }

        //或者 使用list专有迭代器
        ListIterator<String> lt = list.listIterator();
        while (lt.hasNext()) {
            String str =  lt.next();
            if (str.equals("def") || str.contains("c")||str.contains("C"))
                lt.remove();
        }
        System.out.println(list.toString());
    }
}
