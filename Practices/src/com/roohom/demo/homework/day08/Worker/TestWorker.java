package com.roohom.demo.homework.day08.Worker;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/**
 * ClassName: TestWorker
 * Author: Roohom
 * Function:测试工人类
 * Date: 2020/7/22 20:06
 * Software: IntelliJ IDEA
 */
public class TestWorker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入工人姓名:");
        String name = sc.next();
        System.out.print("请录入工人工龄:");
        int year = sc.nextInt();
        Worker wk = new Worker(name,year);

        System.out.println(wk.toString());
    }
}
