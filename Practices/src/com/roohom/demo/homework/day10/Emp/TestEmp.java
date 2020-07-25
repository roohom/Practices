package com.roohom.demo.homework.day10.Emp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: TestEmp
 * Author: Roohom
 * Function:Emps
 * Date: 2020/7/25 21:08
 * Software: IntelliJ IDEA
 */
public class TestEmp {
    public static void main(String[] args) {
        Emp emp1 = new Emp(2800);
        Emp emp2 = new Emp(3500);
        Emp emp3 = new Emp(5600);

        List<Emp> emps = new ArrayList<>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        Iterator<Emp> it = emps.iterator();
        while (it.hasNext()) {
            Emp next =  it.next();
            if (next.getSalary()<=3000)
                it.remove();
            if (next.getSalary()>3000) {
                next.setSalary(next.getSalary()+100);
            }
        }
        System.out.println(emps);
    }
}
