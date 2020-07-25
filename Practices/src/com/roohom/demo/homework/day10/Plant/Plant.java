package com.roohom.demo.homework.day10.Plant;

/**
 * ClassName: Plant
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 21:13
 * Software: IntelliJ IDEA
 */
public class Plant {
    private String name;
    private int price;

    public Plant() {
    }

    public Plant(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void showInfo()
    {
        System.out.println("名字:"+this.getName()+","+"价格:"+this.getPrice());
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
