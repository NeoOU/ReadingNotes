package com.omed.ch2.service;

import com.omed.ch2.extthread.Volatile;

/**
 * Synchronized有volatile相同的将线程工作内存的私有变量与公共内存中变量同步的功能
 * 没有volatile修饰isContinueRun或者没有synchronized代码块，在JVM的-server模式下就会死循环。
 * 只要类中有synchronized方法和代码块，那么这个类的实例变量就是可见性的？
 */
public class SyncVolatile {

//	volatile boolean isContinueRun = true;
	boolean isContinueRun = true;

	public void runMethod() {
        String anyString = new String();
		while (isContinueRun == true) {
			synchronized (anyString) {
				System.out.println("锁定的是："+anyString);
			}
		}
		System.out.println("停下来了！");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}