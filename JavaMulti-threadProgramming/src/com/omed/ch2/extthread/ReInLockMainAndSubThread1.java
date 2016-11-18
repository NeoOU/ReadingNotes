package com.omed.ch2.extthread;

import com.omed.ch2.service.ReInLockMain;
import com.omed.ch2.service.ReInLockSub;

/**
 * Created by xiaob_000 on 2016/10/18 0018.
 */
public class ReInLockMainAndSubThread1 extends Thread {
    private ReInLockSub reInLockSub;
    private ReInLockMain reInLockMain;

    public ReInLockMainAndSubThread1(ReInLockSub reInLockSub,ReInLockMain reInLockMain) {
        this.reInLockSub=reInLockSub;
        this.reInLockMain=reInLockMain;
    }
    @Override
    public void run() {
        try {
            reInLockSub.getParentValue(reInLockMain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
