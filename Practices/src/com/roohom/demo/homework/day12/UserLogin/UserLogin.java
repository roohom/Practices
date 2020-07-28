package com.roohom.demo.homework.day12.UserLogin;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: UserLogin
 * Author: Roohom
 * Function:用户注册和登录
 * Date: 2020/7/28 20:23
 * Software: IntelliJ IDEA
 */
public class UserLogin {

    /**
     * 用户注册
     * @param list 用户对象的List集合
     * @param user 用户对象
     */
    public static void registe(List<User> list, User user) {
        if (list.size() > 3)
            System.out.println("用户已满，禁止注册！");
        else {
            System.out.println("请输入用户名:");
            user.setName(new Scanner(System.in).next());
            System.out.println("请设置登录密码:");
            user.setPasswd(new Scanner(System.in).next());
            System.out.println("请输入您的出生日期:");
            user.setBirth(new Scanner(System.in).next());
            System.out.println("请输入您的爱好:");
            user.setHobby(new Scanner(System.in).next());
            list.add(user);
        }
    }

    /**
     * 用户登录
     * @param users 用户对象的集合
     */
    public static void login(List<User> users) {
        System.out.println("请输入您的用户名:");
        String name = new Scanner(System.in).next();
        System.out.println("请输入您的密码:");
        String passwd = new Scanner(System.in).next();
        for (User user : users) {
            if (name.equals(user.getName())) {
                if (user.getPasswd().equals(passwd))
                    System.out.println(user.toString());
                else
                    System.out.println("用户名或密码错误！");
            }

        }
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        while (true) {
            System.out.println("1.注册    2.登录    3.退出");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equals("1")) {
                //用户注册的同时加入到user集合
                registe(users, new User());
            } else if (input.equals("2"))
                login(users);
            else if (input.equals("3")) {
                System.out.println("再见~");
                break;
            }
        }
    }
}
