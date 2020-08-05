package com.roohom.demo.ClassDemo.Annotation.BookStore;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: BookStore
 * Author: Roohom
 * Function:
 * Date: 2020/8/5 15:39
 * Software: IntelliJ IDEA
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Book {
    String value();

    double price() default 100;

    String[] authors();
}

@Book(value = "红楼梦", authors = {"曹雪芹"})
public class BookStore {

    @Book(value = "西游记", price = 98, authors = {"吴承恩"})
    public void show() {

    }
}
