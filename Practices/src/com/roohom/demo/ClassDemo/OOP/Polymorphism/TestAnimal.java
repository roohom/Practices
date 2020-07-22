package com.roohom.demo.ClassDemo.OOP.Polymorphism;

/**
 * ClassName: TestAnimal
 * Author: Roohom
 * Function:
 * Date: 2020/7/22 11:33
 * Software: IntelliJ IDEA
 */
public class TestAnimal {
    public static void main(String[] args) {
        //需求: 定义一个show()方法, 接收任意的动物类对象, 然后调用该对象的eat()方法.
        //扩展功能: 如果是猫, 就抓老鼠, 如果是狗, 就看家.
        Cat c = new Cat();
        show(c);            //猫吃鱼.
        System.out.println("-------------------");

        //调用Dog#eat()
        Dog d = new Dog();
        show(d);          //狗吃肉
    }

    //方式二: 多态版
    public static void show(Animal an) {        //Animal an = new Dog();  根据多态访问成员方法的规则: 编译看左, 运行看右.
        an.eat();

        //判断传入的是否是猫类
        if (an instanceof Cat) {
            //走到这里, 说明是猫类对象, 向下转型, 然后调用方法即可.
            Cat c = (Cat)an;
            c.catchMouse();
        } else if(an instanceof Dog) {
            //走到这里, 说明是狗类对象, 向下转型, 然后调用方法即可.
            Dog d = (Dog)an;
            d.lookHome();
        }
    }

}
