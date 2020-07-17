package com.Tuling.demo.OOP;

/**
 * ClassName: Point
 * Author: Roohom
 * Function:
 * Date: 2020/7/17 21:30
 * Software: IntelliJ IDEA
 */
public class Point {
    int x;
    int y;
    void show(){
        System.out.println("("+x+","+y+")");
    }
    void right(int i){
        x = x+i;
    }


    public static void main(String[] args) {
        Point p = new Point();
        p.show();
        p.right(10);
        p.show();
    }

}
