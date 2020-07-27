package com.roohom.demo.homework.day11.Person;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: TestPerson
 * Author: Roohom
 * Function:
 * Date: 2020/7/27 18:58
 * Software: IntelliJ IDEA
 */
public class TestPerson {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("李大嘴",23,"女","1330000000","北京朝阳"));
        list.add(new Person("张大炮",23,"女","1390000001","安徽合肥"));
        list.add(new Person("苏大强",24,"","1990000002","湖北武汉"));

        //实现1:迭代器打印所有人信息
        Iterator<Person> it = list.iterator();
        for (Person person : list) {
            System.out.println(person);
        }
        //实现2:年龄小于20岁，删除该对象
        for (Person person : list) {
            if (person.getAge()<20)
                it.remove();
        }
        System.out.println(list);

        //实现2:没有性别就默认为男
        for (Person person : list) {
            if (person.getSex().equals("")||person.getSex()==null)
                person.setSex("男");
        }
        System.out.println(list);
    }
}
