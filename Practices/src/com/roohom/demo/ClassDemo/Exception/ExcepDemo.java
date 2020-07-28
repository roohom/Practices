package com.roohom.demo.ClassDemo.Exception;

/**
 * ClassName: ExcepDemo
 * Author: Roohom
 * Function:异常
 * Date: 2020/7/28 16:01
 * Software: IntelliJ IDEA
 */
public class ExcepDemo {
    public static void main(String[] args) {
        int a = 10;
        int b =0;
        try{
            System.out.println(a/b);
            int sum = a+b; //try块里的变量作用域仅限于try块
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("进行异常处理");
            e.printStackTrace();//打印异常信息，此处在最后打印，是因为是两个线程
        }
        finally {
            System.out.println("会执行到这里吗？");
        }

        System.out.println("执行到这里了...");
    }
}
