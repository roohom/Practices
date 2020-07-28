package com.roohom.demo.homework.day12.Cars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Test
 * Author: Roohom
 * Function:测试类
 * Date: 2020/7/28 21:18
 * Software: IntelliJ IDEA
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Auto", 25);
        Car car2 = new Car("Audi", 500);
        Car car3 = new Car("Benz", 700);
        Car car4 = new Car("BMW", 400);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        Iterator<Car> it = carList.iterator();
        int sum = 0;
        while (it.hasNext()) {
            Car next = it.next();
            //System.out.println(next);
            if (next.getBrand().charAt(0)=='B' || next.getBrand().charAt(0)=='b')
                sum+=next.getPrice();
        }
        System.out.println("以字母B开头的车品牌的车的价格总和是:"+sum);
    }
}
