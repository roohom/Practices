package com.roohom.demo.ClassDemo.Reflection;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:演示反射
 * Date: 2020/8/3 17:08
 * Software: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {
        Person p =new Person();

        try {
           Class aClass =  Class.forName("com.roohom.demo.ClassDemo.Reflection.Person");

           Class bClass= Person.class;

           Class cClass = p.getClass();

            System.out.println(aClass);
            System.out.println(bClass);
            System.out.println(cClass);


            //Class中的常用方法
            System.out.println(aClass.getName());
            System.out.println(bClass.getSimpleName());
            //System.out.println(cClass.getName());


            Person person = (Person) aClass.newInstance();

            person.name = "sss";
            person.sleep();
            System.out.println(person.name);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
