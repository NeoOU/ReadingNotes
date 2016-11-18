package com.omed.ch3.test;

import com.omed.ch3.entities.Bread;
import com.omed.ch3.entities.Customer;
import com.omed.ch3.entities.Producer;
import com.omed.ch3.thread.ConsumeThread;
import com.omed.ch3.thread.ProduceThread;

/**
 * Created by xiaob_000 on 2016/10/21 0021.
 */
public class TestProducerAndCostomer {
    public static void main(String[] args) throws Exception {

        Producer p1 = new Producer();
        Producer p2 = new Producer();
        Producer p3 = new Producer();
        Producer p4 = new Producer();
        Producer p5 = new Producer();

        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        Customer c4 = new Customer();
        Customer c5 = new Customer();

        long starttime = System.currentTimeMillis();

        ProduceThread pt1 = new ProduceThread(p1, starttime);
        ProduceThread pt2 = new ProduceThread(p2, starttime);
        ProduceThread pt3 = new ProduceThread(p3, starttime);
        ProduceThread pt4 = new ProduceThread(p4, starttime);
        ProduceThread pt5 = new ProduceThread(p5, starttime);
        ConsumeThread ct1 = new ConsumeThread(c1, starttime);
        ConsumeThread ct2 = new ConsumeThread(c2, starttime);
        ConsumeThread ct3 =new ConsumeThread(c3, starttime);
        ConsumeThread ct4 =new ConsumeThread(c4, starttime);
        ConsumeThread ct5 =new ConsumeThread(c5, starttime);

        pt1.start();
        pt2.start();
        pt3.start();
        pt4.start();
        pt5.start();

        Thread.sleep(20000);
        System.out.println("开始消费前面包数量为：" + Bread.breads.size());

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();

        //用join方法实现
//        Thread.sleep(1000 * 60 * 5);
        pt1.join();
        pt2.join();
        pt3.join();
        pt4.join();
        pt5.join();

        ct1.join();
        ct2.join();
        ct3.join();
        ct4.join();
        ct5.join();
/*        System.out.println("produceCount = "+Producer.produceCount);
        System.out.println("consumeCount = "+Customer.consumeCount);
        System.out.println("left bread count = "+ Bread.breads.size());*/

        Integer produceCount = p1.getEachProduceCount() + p2.getEachProduceCount() + p3.getEachProduceCount() + p4.getEachProduceCount() + p5.getEachProduceCount();
        System.out.println("produceCount = " + produceCount);
        Integer consumeCount = c1.getEachConsumeCount() + c2.getEachConsumeCount() + c3.getEachConsumeCount() + c4.getEachConsumeCount() + c5.getEachConsumeCount();
        System.out.println("consumeCount = " + consumeCount);
        System.out.println("left bread count = " + Bread.breads.size());

        Integer produceCount1 = p1.getEacheAtomicProduceCount().intValue() + p2.getEacheAtomicProduceCount().intValue() + p3.getEacheAtomicProduceCount().intValue() + p4.getEacheAtomicProduceCount().intValue() + p5.getEacheAtomicProduceCount().intValue() ;
        System.out.println("produceCount1 = " + produceCount1);
        Integer consumeCount1 = c1.getEachAtomicConsumeCount().intValue()+c2.getEachAtomicConsumeCount().intValue()+c3.getEachAtomicConsumeCount().intValue()+c4.getEachAtomicConsumeCount().intValue()+c5.getEachAtomicConsumeCount().intValue();
        System.out.println("consumeCount1 = " + consumeCount1);
        System.out.println("left bread count = " + Bread.breads.size());


    }
}
