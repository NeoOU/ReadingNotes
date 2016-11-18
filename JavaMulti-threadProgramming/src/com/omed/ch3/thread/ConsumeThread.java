package com.omed.ch3.thread;

import com.omed.ch3.entities.Bread;
import com.omed.ch3.entities.Customer;

/**
 * Created by xiaob_000 on 2016/10/21 0021.
 */
public class ConsumeThread extends Thread {

    private Customer customer;
    private long startTime;

    public ConsumeThread(Customer customer,long startTime) {
        this.customer = customer;
        this.startTime=startTime;
    }

    @Override
    public void run() {
        while (System.currentTimeMillis()-startTime<1000*60*5) {
            customer.consume();
        }
        System.out.println("消费线程"+Thread.currentThread().getName()+"消费数量为："+Bread.threadLocal.get());
    }
}
