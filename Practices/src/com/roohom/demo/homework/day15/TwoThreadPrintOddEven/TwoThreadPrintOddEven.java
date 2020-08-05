package com.roohom.demo.homework.day15.TwoThreadPrintOddEven;

/**
 * ClassName: TwoThreadPrintOddEven
 * Author: Roohom
 * Function:双线程打印0~100之间的奇数和偶数
 * Date: 2020/8/2 19:40
 * Software: IntelliJ IDEA
 */
class PrinNumbet extends Thread {
    boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    @Override
    public void run() {
        if (flag) {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0)
                    System.out.println("线程" + Thread.currentThread().getName() + "正在打印偶数:" + i);
            }
        } else {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0)
                    System.out.println("线程" + Thread.currentThread().getName() + "正在打印奇数:" + i);
            }
        }
    }
}

public class TwoThreadPrintOddEven {
    public static void main(String[] args) {

        PrinNumbet pt1 = new PrinNumbet();
        PrinNumbet pt2 = new PrinNumbet();
        pt1.setFlag(true);
        pt2.setFlag(false);
        pt1.start();
        pt2.start();
    }
}
