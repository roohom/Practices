package com.roohom.demo.homework.day07.Animals;

/**
 * ClassName: TestGroom
 * Author: Roohom
 * Function:测试类
 * Date: 2020/7/21 20:19
 * Software: IntelliJ IDEA
 */
public class TestGroom {
    public static void main(String[] args) {
        Dog d = new Dog();
        frog f = new frog();
        Sheep s = new Sheep();

        Groom.grooming(d);
        Groom.grooming(f);
        Groom.grooming(s);
    }
}
