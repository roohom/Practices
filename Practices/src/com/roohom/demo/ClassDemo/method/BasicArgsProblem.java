package com.roohom.demo.ClassDemo.method;

/**
 * ClassName: BasicArgsProblem
 * Author: Roohom
 * Function:参数问题，基本数据类型
 * Date: 2020/7/18 17:47
 * Software: IntelliJ IDEA
 */
public class BasicArgsProblem {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用方法前:"+number);
        change(number);
        System.out.println("调用方法后:"+number);
    }

    public static void change(int number)
    {
        number = 200;
    }
}

//结论： 基本类型作为参数时，形参的改变对实参没有任何音响
