package com.omed.ch2.extthread;

import com.omed.ch2.service.SyncVolatile;

public class SyncVolatileThreadB extends Thread {
    private SyncVolatile service;

	public SyncVolatileThreadB(SyncVolatile service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.stopMethod();
	}

}