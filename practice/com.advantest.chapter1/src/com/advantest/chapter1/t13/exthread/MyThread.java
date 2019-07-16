package com.advantest.chapter1.t13.exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
//			if (this.interrupted()) {
				if (this.isInterrupted()) {
				System.out.println("This thread has been interrupted, break.");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
	}
}
