package com.omed.ch2.extthread;

public class Volatile extends Thread {

	/**
	 *
	 * volatile关键字  强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值
	 */
	volatile private boolean isRunning = true;
//	private boolean isRunning = true;

	public boolean isRunning() {
        return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		System.out.println("进入run了");
		while (isRunning == true) {
		}
		System.out.println("线程被停止了！");
	}

}