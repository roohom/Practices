package com.roohom.demo.homework.day15.NumGuess;

/**
 * ClassName: NumGuess
 * Author: Roohom
 * Function:两个线程猜数字游戏
 * https://blog.csdn.net/yw19981016/article/details/90645097
 * Date: 2020/8/2 20:10
 * Software: IntelliJ IDEA
 */
public class NumGuess {
    private int num;
    private int gsNum;
    //猜没猜数字
    private boolean guess = false;
    //给没给数字
    private boolean give = false;

    int min = 1;
    int max = 100;

    public synchronized void generateNum() {

        //如果有数字，等待猜数字
        if (give) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有数字就生成数字
        int num = (int) (Math.random() * 100) + 1;
        this.num = num;
        System.out.println("第一个线程正在设置数字...");
        System.out.println("本次设置的数字是:" + num);

        //生成数字之后，现在有数字了，修改数字状态
        give = true;
        guess = true;


        while (guess) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (this.num > gsNum) {
            min = gsNum + 1;
            System.out.println("猜小了");
        } else if (this.num < gsNum) {
            System.out.println("猜大了");
            max = gsNum - 1;
        } else {
            System.out.println("本次猜的数字是:" + gsNum);
            System.out.println("猜对啦！");
            return;
        }
        guess = true;


        notifyAll();
    }

    public synchronized void guessNum() {
        //int gsNum = new Scanner(System.in).nextInt();

        //如果猜了，等待给出提示
        while (!guess) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有数字，就直接猜数字
        gsNum = (int) (Math.random() * (max + 1 - min)) + 1;
        System.out.println("第二个线程猜的数字是:" + gsNum);
        guess = false;
        //等待第一个线程给出提示
        notifyAll();
    }
}
