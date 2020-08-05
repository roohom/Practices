package com.roohom.demo.ClassDemo.Annotation.AnnoLife;

/**
 * ClassName: TestMyJunit
 * Author: Roohom
 * Function:带注解的测试类
 * Date: 2020/8/5 15:55
 * Software: IntelliJ IDEA
 */
public class TestMyJunit {

    @MyTest
    public void test1() {
        System.out.println("法1执行了");
    }

    public void test2() {
        System.out.println("法2执行了");
    }
    @MyTest
    public void test3() {
        System.out.println("法3执行了");
    }
}
