package com.omed.ch2.extthread;

import com.omed.ch2.service.ReInLockSub;

public class ReInLockMainAndSubThread extends Thread {

	private ReInLockSub reInLockSub;

	public ReInLockMainAndSubThread(ReInLockSub reInLockSub) {
		this.reInLockSub=reInLockSub;
	}

	@Override
	public void run() {
		reInLockSub.operateISubMethod();
	}

}