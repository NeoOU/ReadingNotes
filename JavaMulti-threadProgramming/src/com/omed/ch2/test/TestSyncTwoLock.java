package com.omed.ch2.test;

import com.omed.ch2.extthread.SyncTwoLockThreadA;
import com.omed.ch2.extthread.SyncTwoLockThreadB;
import com.omed.ch2.extthread.SyncTwoLockThreadC;
import com.omed.ch2.service.SyncTwoLock;

/**
 * Created by xiaob_000 on 2016/10/18 0018.
 */
public class TestSyncTwoLock {
    public static void main(String[] args) {
        SyncTwoLock service = new SyncTwoLock();

        SyncTwoLockThreadA a = new SyncTwoLockThreadA(service);
        a.setName("A");
        a.start();

        SyncTwoLockThreadB b = new SyncTwoLockThreadB(service);
        b.setName("B");
        b.start();

        SyncTwoLockThreadC c = new SyncTwoLockThreadC(service);
        c.setName("C");
        c.start();

    }

}
