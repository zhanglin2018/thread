package com.advantest.chapter1.t14.exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			for (int i = 0; i < 500000; i++) {
				System.out.println("i=" + (i + 1));
				Thread.sleep(100);
			}
			
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("Thread.sleep hass been interrupted, enter catch!"  +  this.isInterrupted());
			e.printStackTrace();
		}
	}
}
