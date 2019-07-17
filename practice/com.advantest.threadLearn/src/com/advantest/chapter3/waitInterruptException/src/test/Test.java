package com.advantest.chapter3.waitInterruptException.src.test;

import com.advantest.chapter3.waitInterruptException.src.extthread.ThreadA;

public class Test {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
