package com.roohom.demo.ClassDemo.Annotation.BookStore;

import java.lang.reflect.Method;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 15:43
 * Software: IntelliJ IDEA
 */
public class Test {

    public static void main(String[] args) {
        test1();
        System.out.println("==========================");
        test2();
    }

    public static void test1() {
        Class bookClass = BookStore.class;
        if (bookClass.isAnnotationPresent(Book.class)) {
            Book book = (Book) bookClass.getAnnotation(Book.class);

            System.out.println("数名:" + book.value());
            System.out.println("价格:" + book.price());
            System.out.println("作者:" + book.authors());

        } else
            System.out.println("没有注解！");
    }

    public static void test2() {
        Class bookClass = BookStore.class;
        try {
            Method method = bookClass.getMethod("show");

            if (bookClass.isAnnotationPresent(Book.class)) {
                Book book = (Book) method.getAnnotation(Book.class);

                System.out.println("数名:" + book.value());
                System.out.println("价格:" + book.price());
                System.out.println("作者:" + book.authors());

            } else
                System.out.println("没有注解！");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }


}
