package com.omed.ch6.extthread;

import com.omed.ch6.domain.MyObject;

public class MyThread extends Thread {

	@Override
    public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}