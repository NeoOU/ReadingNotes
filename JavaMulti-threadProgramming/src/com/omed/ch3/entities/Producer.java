package com.omed.ch3.entities;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xiaob_000 on 2016/10/21 0021.
 */
public class Producer {

    public Integer getEachProduceCount() {
        return eachProduceCount;
    }

    public void setEachProduceCount(Integer eachProduceCount) {
        this.eachProduceCount = eachProduceCount;
    }

    private AtomicInteger eacheAtomicProduceCount = new AtomicInteger(0);

    public AtomicInteger getEacheAtomicProduceCount() {
        return eacheAtomicProduceCount;
    }

    public void setEacheAtomicProduceCount(AtomicInteger eacheAtomicProduceCount) {
        this.eacheAtomicProduceCount = eacheAtomicProduceCount;
    }

    private Integer eachProduceCount=0;

    public static AtomicInteger produceCount= new AtomicInteger(0);

    volatile public static boolean hasNotified = false;

    private  static final Object producelock =new Object();

    public void produce() {
        try {
            while (Bread.breads.size() > 200) {
                synchronized (Bread.breads) {
                    System.out.println("面包总数大于200了，开始停产，当前面包数量为：" + Bread.breads.size());
                    hasNotified = false;
                    Bread.breads.wait();
                }
            }

            /**
             * 方案一：
             * incrementAndGet()方法内部是原子的，但是方法的调用不是原子的，计数不准确
             */
/*            Bread.breads.add(new Bread());
            Thread.sleep(300);
            produceCount.incrementAndGet();
            System.out.println("生产了一个，当前面包数量为：" + Bread.breads.size());*/

            /**
             * 方案二：
             * 虽然计数准确,但也此导致线程的阻塞
             */
/*            synchronized (producelock) {
                Bread.breads.add(new Bread());
                Thread.sleep(300);
                produceCount.incrementAndGet();
                System.out.println("生产了一个，当前面包数量为：" + Bread.breads.size());
            }*/

            /**
             * 方法三：
             * 各个线程各自计数
             * 此时用Integer或AtomicInteger的效果一样
             * 但是，计数仍不准确
             */
/*            Bread.breads.add(new Bread());
            Thread.sleep(300);
            eachProduceCount++;
            eacheAtomicProduceCount.incrementAndGet();
            System.out.println("生产了一个，当前面包数量为：" + Bread.breads.size());*/

            /**
             * 用ThreadLocal类来实现
             */
            Bread.breads.add(new Bread());
            Thread.sleep(300);
            eachProduceCount++;
            eacheAtomicProduceCount.incrementAndGet();
            Bread.threadLocal.set(Bread.threadLocal.get()+1);
            System.out.println("生产了一个，当前面包数量为：" + Bread.breads.size());


            if (Bread.breads.size() > 50 && !Customer.hasNotified) {
                synchronized (Bread.breads) {
                    Bread.breads.notifyAll();
                    Customer.hasNotified=true;
                    System.out.println("面包总数大于50了，通知消费者开始消费，当前面包数量为：" + Bread.breads.size());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
