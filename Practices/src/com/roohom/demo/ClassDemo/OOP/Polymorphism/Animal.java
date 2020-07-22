package com.roohom.demo.ClassDemo.OOP.Polymorphism;

/**
 * ClassName: Animal
 * Author: Roohom
 * Function:动物类
 * Date: 2020/7/22 11:31
 * Software: IntelliJ IDEA
 */
public class Animal {
        //属性, 姓名, 年龄
        private String name;
        private int age;

        public Animal() {
        }

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //行为, 吃饭
        public void eat() {
            System.out.println("动物要吃饭!");
        }
    }


