package com.roohom.demo.homework.day07.Book;

/**
 * ClassName: TestBook
 * Author: Roohom
 * Function:测试类
 * Date: 2020/7/21 19:11
 * Software: IntelliJ IDEA
 */
public class TestBook {


    public static double getMaxPrice(double price1,double price2, double price3){
        double max = (price1>price2 ? price1:price2)>price3?(price1>price2 ? price1:price2):price3;
        return max;
    }

    public static void main(String[] args) {
        Book bk1 = new Book("1001","Java防脱发指南",99.8);
        Book bk2 = new Book("1002","面向对象，从入门到入坟",39.8);
        Book bk3 = new Book("1003","MySQL删库跑路高级指南",29.9);
        double maxPrice = getMaxPrice(bk1.getPrice(),bk2.getPrice(),bk3.getPrice());
        if (bk1.getPrice()==maxPrice)
        {
            System.out.println("图书编号:"+bk1.getNumber()+","+"数名:"+bk1.getName()+","+"价格:"+bk1.getPrice());
        }
        else if (bk2.getPrice()==maxPrice)
        {
            System.out.println("图书编号:"+bk2.getNumber()+","+"数名:"+bk2.getName()+","+"价格:"+bk2.getPrice());
        }
        else {
            System.out.println("图书编号:"+bk3.getNumber()+","+"数名:"+bk3.getName()+","+"价格:"+bk3.getPrice());
        }

    }
}
