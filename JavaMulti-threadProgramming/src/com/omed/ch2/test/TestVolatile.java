package com.omed.ch2.test;

import com.omed.ch2.extthread.Volatile;

public class TestVolatile {
    public static void main(String[] args) {
		try {
			Volatile thread = new Volatile();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}