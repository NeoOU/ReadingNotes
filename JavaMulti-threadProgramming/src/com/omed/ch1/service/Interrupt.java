package com.omed.ch1.service;

/**
 * Created by xiaob_000 on 2016/10/16 0016.
 */
public class Interrupt extends Thread {
    @Override
    public void run() {
        super.run();
        try {
//            System.out.println("this thread interrupted-1="+this.interrupted());
            System.out.println("this thread interrupted-2="+this.isInterrupted());
            //Thread.sleep(3000);
            for (int i = 0; i < 5000; i++) {
                System.out.println("i=" + (i + 1));
                if (this.isInterrupted()) {//效果等同于：this.interrupted(),Thread.currentThread.interrupted()
                    System.out.println("##############this thread interrupted="+true);
                    break;
                }
            }
            Thread.sleep(3000);//先interrupt再sleep
        } catch (Exception e) {//在sleep状态下停止线程，会清除停止状态值，使之成为false
            System.out.println("this thread interrupted-3="+this.interrupted());
            System.out.println("this thread interrupted-4="+this.isInterrupted());
            System.out.println("mythread out");
            e.printStackTrace();
        }
    }
}
