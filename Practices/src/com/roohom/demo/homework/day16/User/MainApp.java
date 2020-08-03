package com.roohom.demo.homework.day16.User;

/**
 * ClassName: MainApp
 * Author: Roohom
 * Function:测试类
 * Date: 2020/8/3 19:21
 * Software: IntelliJ IDEA
 */
public class MainApp {
    public static void main(String[] args) {
        Class uClass = User.class;

        try {
            User user = (User) uClass.newInstance();
            user.sayHello();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
