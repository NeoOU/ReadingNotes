package com.omed.ch2.extthread;

import com.omed.ch2.service.SyncTwoLock;

/**
 * Created by xiaob_000 on 2016/10/18 0018.
 */
public class SyncTwoLockThreadC extends Thread {
    private SyncTwoLock service;

    public SyncTwoLockThreadC(SyncTwoLock service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
