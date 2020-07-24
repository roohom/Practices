package com.roohom.demo.ClassDemo.practices; /**
 * ClassName: com.roohom.demo.ClassDemo.practices.testScanner
 * Author: Roohom
 * File: com.roohom.demo.ClassDemo.practices.testScanner
 * Date: 2020/7/12 11:25
 * Software: IntelliJ IDEA
 */

import java.util.Scanner;

public class testScanner {
    public static void main(String[] args) {
        System.out.println("本案例用于尝试Scanner扫描接收用户的输入:");

        //创建Scanner类
        Scanner sc = new Scanner(System.in);

        //创建scanner对象
        String s1 = sc.next();

        //输出接收到参数
        System.out.println("你输入的是"+s1);

        Scanner sc1 = new Scanner(System.in);
        String s2 = sc1.nextLine();
        System.out.println("你又输入了:"+s2);



    }
}
