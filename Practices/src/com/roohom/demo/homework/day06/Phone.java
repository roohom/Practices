package com.roohom.demo.homework.day06;

/**
 * ClassName: Phone
 * Author: Roohom
 * Function:
 * Date: 2020/7/19 19:47
 * Software: IntelliJ IDEA
 */

/**
 * 定义手机类
 */
public class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone()
    {

    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //方法 打电话
    public void call()
    {
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机"+"打电话...");
    }
    //方法 发短信
    public void sendMessage()
    {
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机"+"发短信...");
    }
}
