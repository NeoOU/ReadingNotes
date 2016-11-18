package com.omed.ch4.extthread;

import com.omed.ch4.service.MyService;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
        super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}