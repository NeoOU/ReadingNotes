package com.omed.ch2.test;

import com.omed.ch2.extthread.ReInLockMainAndSubThread;
import com.omed.ch2.extthread.ReInLockMainAndSubThread1;
import com.omed.ch2.extthread.ReInLockThread;
import com.omed.ch2.service.ReInLockMain;
import com.omed.ch2.service.ReInLockSub;

/**
 * Created by xiaob_000 on 2016/10/17 0017.
 */
public class TestReInLock {
    public static void main(String[] args) throws Exception{
//        ReInLockThread thread = new ReInLockThread();//拿到的只有一个锁。com.omed.ch2.service.ReInLock

        /*
         * 可重入锁机制：A线程在拿到子类a的锁后，可以调用父类b的同步方法（不用显式地拿到父类b的锁，实际已经拿到）。此时B线程调用父类b另一同步方法时，需要等A释放子类a的锁???
         * 是否是因为jdk在编译的时候，已经把getValue()方法编译到了子类中。调用的getValue()方法是子类中的，而非父类中的。A线程自始至终都只拿到了子类a的锁，所以要等A线程释放子类a的锁----->父类b根本没有new出来，重入的本来就是自身的方法
         */
        ReInLockSub reInLockSub = new ReInLockSub();
        ReInLockMainAndSubThread thread = new ReInLockMainAndSubThread(reInLockSub);
        thread.start();
        Thread.sleep(300);

        ReInLockMain reInLockMain = new ReInLockMain();
        ReInLockMainAndSubThread1 thread1 = new ReInLockMainAndSubThread1(reInLockSub,reInLockMain);
        thread1.start();

        reInLockMain.getValue();
        reInLockSub.getValue();
    }
}
