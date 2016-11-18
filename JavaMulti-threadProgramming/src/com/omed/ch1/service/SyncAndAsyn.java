package com.omed.ch1.service;

/**
 * Created by xiaob_000 on 2016/10/16 0016.
 * 测试线程的同步与异步执行
 */
public class SyncAndAsyn extends Thread {
    @Override
    public void run() {
        try {
            //Thread.currentThread().sleep(10000);
            for (int i = 0; i < 10; i++) {//for循环里的代码是顺序执行
                int time = (int) (Math.random() * 1000);
//                Thread.sleep(time);
                Thread.currentThread().sleep(time);
                System.out.println("run=" + Thread.currentThread().getName()+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
