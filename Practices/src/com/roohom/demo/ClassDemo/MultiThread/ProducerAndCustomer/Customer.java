package com.roohom.demo.ClassDemo.MultiThread.ProducerAndCustomer;

/**
 * ClassName: Customer
 * Author: Roohom
 * Function:消费者
 * Date: 2020/8/2 21:10
 * Software: IntelliJ IDEA
 */
public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }
    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}
