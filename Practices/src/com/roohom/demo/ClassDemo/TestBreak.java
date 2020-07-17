package com.roohom.demo.ClassDemo;

/**
 * ClassName: TestBreak
 * Author: Roohom
 * Function:
 * Date: 2020/7/15 08:26
 * Software: IntelliJ IDEA
 */
// 在if block中加入break可以打印2两次
//在if block中加入continue可以打印7次
//在if block中加入System.out.println("HelloWorld");可以打印13次
public class TestBreak {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            //if block
            if (i % 3 == 0) {
                System.out.println("HelloWorld");
            }
            System.out.println("HelloWorld" + i);
        }
    }
}
