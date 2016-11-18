package com.omed.ch3.entities;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xiaob_000 on 2016/10/21 0021.
 */
public class Customer {

    private Integer eachConsumeCount=0;

    private AtomicInteger eachAtomicConsumeCount = new AtomicInteger(0);

    public AtomicInteger getEachAtomicConsumeCount() {
        return eachAtomicConsumeCount;
    }

    public void setEachAtomicConsumeCount(AtomicInteger eachAtomicConsumeCount) {
        this.eachAtomicConsumeCount = eachAtomicConsumeCount;
    }

    public Integer getEachConsumeCount() {
        return eachConsumeCount;
    }

    public void setEachConsumeCount(Integer eachConsumeCount) {
        this.eachConsumeCount = eachConsumeCount;
    }

    volatile public static boolean hasNotified = true;

    public static AtomicInteger consumeCount = new AtomicInteger(0);

    private static final Object consumeLock=new Object();

    public void consume() {
        try {
            if (Bread.breads.size() < 120 && !Producer.hasNotified) {
                synchronized (Bread.breads) {
                    Bread.breads.notifyAll();
                    Producer.hasNotified = true;
                    System.out.println("面包总数小于100了，通知生产者生产，当前面包数量为：" + Bread.breads.size());
                }
            }
            while (Bread.breads.size() < 10) {
                synchronized (Bread.breads) {
                    hasNotified = false;
                    System.out.println("面包总数小于10了，停止消费，当前面包数量为：" + Bread.breads.size());
                    Bread.breads.wait();
                }
            }
/*            synchronized (consumeLock) {
                Bread.breads.remove(0);
                consumeCount.incrementAndGet();//虽然incrementAndGet()方法内部是原子的，但是也要方法的调用是原子的，才能正确计数
                System.out.println("消费了一个面包，当前面包数量为：" + Bread.breads.size());
                Thread.sleep(200);
            }*/

/*            Bread.breads.remove(0);
            eachConsumeCount++;
            eachAtomicConsumeCount.incrementAndGet();
            System.out.println("消费了一个面包，当前面包数量为：" + Bread.breads.size());
            Thread.sleep(200);*/

            Bread.breads.remove(0);
            eachConsumeCount++;
            eachAtomicConsumeCount.incrementAndGet();
            Bread.threadLocal.set(Bread.threadLocal.get()+1);
            System.out.println("消费了一个面包，当前面包数量为：" + Bread.breads.size());
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
