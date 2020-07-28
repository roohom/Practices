package com.roohom.demo.homework.day12.Cars;

/**
 * ClassName: Car
 * Author: Roohom
 * Function:汽车类
 * Date: 2020/7/28 21:17
 * Software: IntelliJ IDEA
 */
public class Car {
    private String brand;
    private int price;

    public Car() {
    }

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
