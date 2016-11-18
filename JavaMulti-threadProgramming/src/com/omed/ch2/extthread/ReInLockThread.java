package com.omed.ch2.extthread;

import com.omed.ch2.service.ReInLock;

public class ReInLockThread extends Thread {
    @Override
	public void run() {
		ReInLock service = new ReInLock();
		service.service1();
	}

}
