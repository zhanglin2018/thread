package com.advantest.chapter1.t13forprint.exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("This for statement has been interrupted. break.");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("continue running.");
	}
}
