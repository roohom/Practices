package com.roohom.demo.homework.day07.Book;

/**
 * ClassName: Book
 * Author: Roohom
 * Function:图书类
 * Date: 2020/7/21 19:08
 * Software: IntelliJ IDEA
 */
public class Book {
    private String number;
    private String name;
    private double price;

    public Book() {
    }

    public Book(String number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
