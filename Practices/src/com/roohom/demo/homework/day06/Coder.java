package com.roohom.demo.homework.day06;

/**
 * ClassName: Coder
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:21
 * Software: IntelliJ IDEA
 */
public class Coder {
    private String name;
    private int id;
    private int salary;

    //方法
    public void work()
    {
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员正在努力的写着代码......");
    }

    //构造
    public Coder() {
    }

    public Coder(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    //set and get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
