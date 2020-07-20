package com.roohom.demo.homework.day06;

/**
 * ClassName: NoDieRabbit
 * Author: Roohom
 * Function:
 * 不死神兔也叫做斐波那契数列或者叫做黄金分割数列或者叫做兔子数列：
 * 不死神兔问题：
 * 有1对兔子，从出生后的第3个月起每个月都生一对兔子，小兔子长到第三
 * 个月后每个月又生一对兔子，假如兔子都不死，问第n个月有几对兔子
 *  需求：我们这里需要知道第二十个月的兔子对数为多少？
 * 斐波那契数列思想的图解如下图所示：
 * Date: 2020/7/19 21:41
 * Software: IntelliJ IDEA
 */

public class NoDieRabbit {
    //规律 f(n) = f(n-1)+f(n-2)
    //求兔子数量的方法
    /**
     * Function:递归调用求斐波那契数列N项
     * @param n 传入参数，斐波那契数列的第N项
     * @return 斐波那契数列的第N项结果
     */
    public static int fibRabbit(int n)
    {
        if (n==1|n==2)
            return 1;
        else if (n>=3){
            return (fibRabbit(n-1)+fibRabbit(n-2));}
        return -1;
    }

    public static void main(String[] args) {
        //第二十个月的兔子数
        System.out.println(fibRabbit(20));
    }
}
