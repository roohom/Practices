package com.roohom.demo.ClassDemo.OOP.TestPrivate;

/**
 * ClassName: Student
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 18:10
 * Software: IntelliJ IDEA
 */
public class Student {
    String name;
    private  int age;

    public void setAge(int age)
    {
        if (age>0 && age<=150)
        {
            this.age = age;
        }
    }

    public int getAge()
    {
        return age;
    }

    public void show()
    {
        System.out.println(name+"----"+age);
    }
}


