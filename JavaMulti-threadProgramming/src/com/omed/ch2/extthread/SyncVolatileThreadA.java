package com.omed.ch2.extthread;

import com.omed.ch2.service.SyncVolatile;

public class SyncVolatileThreadA extends Thread {
    private SyncVolatile service;

	public SyncVolatileThreadA(SyncVolatile service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}
}