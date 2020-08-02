package com.roohom.demo.homework.day15.RabbitAndTurtleRace;


/**
 * ClassName: RabbitAndTurtleRace
 * Author: Roohom
 * Function:多线程实现龟兔赛跑
 * Date: 2020/8/2 19:51
 * Software: IntelliJ IDEA
 */
class Race implements Runnable {
    private int distance = 0;
    //判断是兔子还是乌龟的布尔值
    boolean flag;

    public Race(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            while (true) {
                if (distance == 40) {
                    try {
                        System.out.println("兔子跑到了第40米，看不见乌龟，小睡一会儿~");
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (distance == 80) {
                    try {
                        System.out.println("兔子跑到了第80米，看不见乌龟，小睡一会儿~");
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (distance == 100) {
                    System.out.println(Thread.currentThread().getName() + "达到终点!");
                    break;
                }
                distance++;
            }
        } else {
            for (int i = 0; i < 100; i++) {
                System.out.println("乌龟正在跑第" + i + "米");
                distance++;
                if (distance == 100) {
                    System.out.println(Thread.currentThread().getName() + "达到终点!");
                    break;
                }
            }
        }
    }
}


public class RabbitAndTurtleRace {
    public static void main(String[] args) {
        Race rabbit = new Race(true);
        Race turtle = new Race(false);

        Thread t1 = new Thread(rabbit, "兔子");
        Thread t2 = new Thread(turtle, "乌龟");
        t1.setPriority(9);
        t1.setPriority(4);

        t1.start();
        t2.start();
    }
}
