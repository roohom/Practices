package com.roohom.demo.ClassDemo.Map.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: StudentMap
 * Author: Roohom
 * Function:
 * 1.创建HashMap集合, 键是学号(String), 值是学生对象(Student).
 * 2.往HashMap集合中添加3组数据.
 * 3.通过两种方式, 遍历HashMap集合.
 * Date: 2020/7/27 18:15
 * Software: IntelliJ IDEA
 */
public class StudentMap {
    public static void main(String[] args) {
        Map<String,Student> map = new HashMap<>();

        map.put("1",new Student("马云",49));
        map.put("2",new Student("马化腾",41));
        map.put("3",new Student("王健林",45));

        //遍历
        //第一种方式:
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+"==="+map.get(key));
        }

        //第二种方式
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> studentEntry : entrySet) {
            System.out.println(studentEntry.getKey()+"===="+studentEntry.getValue());
        }


    }
}
