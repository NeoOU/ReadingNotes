package com.omed.ch2.extthread;

public class VolatileAndAtomic extends Thread {
    //volatile
	private static int count;

	synchronized
	private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}

	@Override
	public void run() {
		addCount();
	}

}