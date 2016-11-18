package com.omed.ch2.service;

/**
 * 重入锁的父子继承
 */
public class ReInLockMain {

	public int i = 10;

	synchronized public void operateIMainMethod() {
        try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public Integer getValue() {
		System.out.println("i="+i);
		return i;
	}

}