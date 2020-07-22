package com.roohom.demo.homework.day08.Worker;

/**
 * ClassName: Worker
 * Author: Roohom
 * Function:工人类
 * Date: 2020/7/22 20:05
 * Software: IntelliJ IDEA
 */
public class Worker {
    private String name;
    private int year;

    public Worker() {
    }

    public Worker(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "姓名:"+getName()+", 工龄:"+getYear();
    }
}
