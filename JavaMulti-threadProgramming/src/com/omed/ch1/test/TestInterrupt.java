package com.omed.ch1.test;

import com.omed.ch1.service.Interrupt;

/**
 * Created by xiaob_000 on 2016/10/16 0016.
 */
public class TestInterrupt {
    public static void main(String[] args) {
        try {
            Interrupt thread = new Interrupt();
            thread.start();
            //Thread.sleep(20);
            thread.interrupt();//如果thread没有对中断状态进行处理,不能停止线程
            Thread.currentThread().interrupt();


            /*
             * thread.interrupted() 返回当前正在执行的线程的中断状态
             * thread.interrupted()源码：currentThread().isInterrupted(true);
             * currentThread() return  the currently executing thread.  不管用Thread.interrupted()还是thread.interrupted()此时返回的都是main线程的中断状态
             * isInterrupted(true) 参数为true：如果是中断状态，则中断状态会被清除为非中断状态 The interrupted state is reset or not based on the value of ClearInterrupted that is passed.
             */
            System.out.println("thread interrupted1="+Thread.interrupted());
            System.out.println("thread interrupted2 ="+ thread.interrupted());
            System.out.println("thread interrupted3 ="+ Thread.interrupted());


            /*
             * isInterrupted()调用的是isInterrupted(false)方法，不会重置中断状态
             * 如果线程不在运行状态调用isInterrupted()方法，返回false  A thread interruption ignored because a thread was not alive at the time of the interrupt will be reflected by this method returning false.
             */
            System.out.println("thread interrupted4 ="+ Thread.currentThread().isInterrupted());
            System.out.println("thread interrupted5 ="+ thread.isInterrupted());
            System.out.println("thread interrupted6 ="+ thread.isInterrupted());

        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
