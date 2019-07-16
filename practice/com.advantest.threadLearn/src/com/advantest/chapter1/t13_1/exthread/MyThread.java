package com.advantest.chapter1.t13_1.exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("throw InterruptedException");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("continue to run for");
		} catch (InterruptedException e) {
			System.out.println("catch the InterruptedException");
			e.printStackTrace();
		}
	}
}
