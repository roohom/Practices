package com.roohom.demo.ClassDemo.MultiThread.ProducerAndCustomer;

/**
 * ClassName: Producer
 * Author: Roohom
 * Function:生产者
 * Date: 2020/8/2 21:10
 * Software: IntelliJ IDEA
 */
public class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            b.put(i);
        }
    }
}
