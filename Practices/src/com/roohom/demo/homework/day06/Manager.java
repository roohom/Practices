package com.roohom.demo.homework.day06;

import sun.awt.windows.WPrinterJob;

/**
 * ClassName: Manager
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 20:17
 * Software: IntelliJ IDEA
 */
public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    //方法
    public void work()
    {
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    //构造
    public Manager() {
    }

    public Manager(int id, int salary, int bonus) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
