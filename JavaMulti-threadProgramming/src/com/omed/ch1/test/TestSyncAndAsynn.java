package com.omed.ch1.test;

import com.omed.ch1.service.SyncAndAsyn;

/**
 * Created by xiaob_000 on 2016/10/16 0016.
 */
public class TestSyncAndAsynn {
    //IDEA debug模式下，打了断点且调用Thread.sleep(time)，main线程一直是sleeping状态?------>这是因为IDEA默认调试阻塞级别为ALL,改为THREAD即可
    public static void main(String[] args) {
        try {

            SyncAndAsyn thread = new SyncAndAsyn();
            thread.setName("myThread");
            //thread.start();//通知“线程规划器”，此线程已准备就绪，等待调用线程的run方法。这个过程其实就是让系统安排时间来调用Thread（name=myThread）的run方法。执行是异步的
            //thread.run();//由main主线程来调用run方法。此时，run方法相当于一个普通方法
            new Thread(thread,"myNewThread").start();//由myNewThread来调用thread的run方法

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
//                Thread.sleep(time);
                 Thread.currentThread().sleep(time);
                System.out.println("main=" + Thread.currentThread().getName()+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
