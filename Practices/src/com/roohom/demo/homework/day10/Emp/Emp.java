package com.roohom.demo.homework.day10.Emp;

/**
 * ClassName: Emp
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 21:07
 * Software: IntelliJ IDEA
 */
public class Emp {
    private int salary;

    public Emp() {
    }

    public Emp(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "salary=" + salary +
                '}';
    }
}
