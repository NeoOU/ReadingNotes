package com.omed.ch3.thread;

import com.omed.ch3.entities.Bread;
import com.omed.ch3.entities.Producer;


/**
 * Created by xiaob_000 on 2016/10/21 0021.
 */
public class ProduceThread extends Thread {
    private Producer producer;
    private long startTime;
    public ProduceThread(Producer producer,long startTime) {
        this.producer=producer;
        this.startTime=startTime;
    }

    @Override
    public void run() {
        while (System.currentTimeMillis()-startTime<1000*60*5  || Bread.breads.size()<=50) {
            producer.produce();
        }
        System.out.println("生产线程"+Thread.currentThread().getName()+"生产数量为："+ Bread.threadLocal.get());
    }
}
