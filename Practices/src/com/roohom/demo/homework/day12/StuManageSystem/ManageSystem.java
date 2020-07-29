package com.roohom.demo.homework.day12.StuManageSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: ManageSystem
 * Author: Roohom
 * Function:系统主界面
 * Date: 2020/7/28 21:35
 * Software: IntelliJ IDEA
 */
public class ManageSystem {

    /**
     * Function: 查看所有学生
     *
     * @param stus 存储学生对象的集合
     */
    public static void showAllStus(List<Student> stus) {
        for (Student stu : stus) {
            System.out.println(stu);
        }
    }

    public static void addStu(List<Student> stus, Student stu) {

        System.out.print("请输入学生学号:");
        int id = new Scanner(System.in).nextInt();
        stu.setID(id);
        System.out.print("请输入学生姓名:");
        String name = new Scanner(System.in).next();
        stu.setName(name);
        System.out.print("请输入学生年龄:");
        int age = new Scanner(System.in).nextInt();
        stu.setAge(age);
        System.out.print("请输入学生住址:");
        String addr = new Scanner(System.in).next();
        stu.setAddr(addr);

        stus.add(stu);
        System.out.println();
        System.out.println("添加学生成功！");


    }

    public static void delStu(List<Student> stus) {
        System.out.println("请输入你要删除的学生的学号:");
        int input = new Scanner(System.in).nextInt();
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getID() == input) {
                stus.remove(i);
                System.out.println("删除学生成功");
            }
        }
    }

    public static void modifyStu(List<Student> stus) {
        System.out.println("请输入你要修改的学生的学号:");
        int modNum = new Scanner(System.in).nextInt();
        for (Student stu : stus) {
            if (stu.getID() == modNum) {
                System.out.println("请输入学生新姓名:");
                stu.setName(new Scanner(System.in).next());
                System.out.println("请输入学生新年龄:");
                stu.setAge(new Scanner(System.in).nextInt());
                System.out.println("请输入学生新住址:");
                stu.setAddr(new Scanner(System.in).next());
                System.out.println("修改学生成功");
            }
        }

    }

    public static boolean exit() {
        System.out.println("再见~");
        return false;
    }

    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("------------欢迎来到学生管理系统,请选择:-----------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");
            String choose = new Scanner(System.in).next();
            switch (choose) {
                case "1":
                    showAllStus(stus);
                    break;
                case "2":
                    addStu(stus, new Student());
                    break;
                case "3":
                    delStu(stus);
                    break;
                case "4":
                    modifyStu(stus);
                    break;
                case "5":
                    flag = exit();
                    break;
            }
        }
    }
}
