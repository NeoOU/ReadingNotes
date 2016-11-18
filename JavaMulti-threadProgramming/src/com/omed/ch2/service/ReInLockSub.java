package com.omed.ch2.service;

public class ReInLockSub extends ReInLockMain {

	synchronized public void operateISubMethod() {
        try {
			while (i > 0) {
				i--;
				System.out.println("sub print i=" + i);
				Thread.sleep(100);
				this.operateIMainMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void getParentValue(ReInLockMain reInLockMain) throws Exception {
		Thread.sleep(200);
		System.out.println("父类中的value值："+reInLockMain.getValue());
	}

}