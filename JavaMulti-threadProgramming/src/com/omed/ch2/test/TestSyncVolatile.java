package com.omed.ch2.test;

import com.omed.ch2.extthread.SyncVolatileThreadA;
import com.omed.ch2.extthread.SyncVolatileThreadB;
import com.omed.ch2.service.SyncVolatile;

public class TestSyncVolatile {

	public static void main(String[] args) {
        try {
			SyncVolatile service = new SyncVolatile();

			SyncVolatileThreadA a = new SyncVolatileThreadA(service);
			a.start();

			Thread.sleep(1000);

			SyncVolatileThreadB b = new SyncVolatileThreadB(service);
			b.start();

			System.out.println("已经发起停止的命令了！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}