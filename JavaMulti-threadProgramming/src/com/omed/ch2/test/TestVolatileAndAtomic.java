package com.omed.ch2.test;

import com.omed.ch2.extthread.VolatileAndAtomic;

public class TestVolatileAndAtomic {
    public static void main(String[] args) {
		VolatileAndAtomic[] mythreadArray = new VolatileAndAtomic[100];
		for (int i = 0; i < 100; i++) {
			mythreadArray[i] = new VolatileAndAtomic();
		}

		for (int i = 0; i < 100; i++) {
			mythreadArray[i].start();
		}

	}

}